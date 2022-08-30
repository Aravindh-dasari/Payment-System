package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Repo.CustomerRepo;
import com.example.demo.Repo.TransactionRepo;
import com.example.demo.model.Customer;
import com.example.demo.model.Informer;
import com.example.demo.model.Transaction;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private SdnReadtext sdn;
	
	public List<Transaction> lstTransactions(){
		
		return transactionRepo.findAll();
	}
	
	public Informer insertTransaction(@RequestBody Transaction usertransfer ) {
		
		Informer informer = new Informer();
		
		try {

			transactionRepo.save(usertransfer);
			
//			Transaction transaction = new Transaction();
//			transaction.setTransfertypecode(usertransfer.getTransfertypecode());
//			transaction.setMessagecode(usertransfer.getMessagecode());
//			transaction.setCurrencyamount(usertransfer.getCurrencyamount());
//			
//			transactionRepo.save(transaction);
			
			informer.setSuccess(true);
		
		}
		
		catch(Exception e){
			
			System.out.println(e);
			informer.setSuccess(false);
			informer.setError(e.getLocalizedMessage());
		}
		
		return informer;
	}
	
	public Informer makeTransfer(Transaction transfer){
		
		Informer informer = new Informer();
		
		String sid = transfer.getCustomerid();
		String rid = transfer.getReceiveraccountholdernumber();
		Float tfee = transfer.getTranferfees();
		
		// Sender Part
		//Check SDN List
		String sdnList = "";
		try {
			sdnList = sdn.readFileAsString("C:\\Users\\Administrator\\Downloads\\DBS Training 2022 Payment Project\\sdnlist.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("SDNFile.txt Not Loaded!");
			e.printStackTrace();
		}
		
		String recName = transfer.getReceiveraccountholdername();
		
		if(sdnList.contains(recName)==false) 
		{
		
		Optional<Customer> senderoption = customerRepo.findById(sid);

		if(senderoption.isPresent()) 
		{	
			
			Customer sender = senderoption.get();
			informer.setMessage("Sender Found");
			Float amount = transfer.getInramount()+tfee;
			Float sclearbal = sender.getClearbalance();
			
			// Float overamount = sender.getOveramount();
			Float overamount = 5000f;
			
			// Updating Sender Clear Balance
			if(amount <= sclearbal || (sender.getOverdraftflag().equalsIgnoreCase("Yes") && amount <= sclearbal+overamount)) {
				
				informer.setMessage(informer.getMessage()+" Sender Balance Updated");
				sender.setClearbalance(sclearbal-amount);
				informer.setSuccess(true);
			
			}
			else {
				
				informer.setSuccess(false);
			}
			
			// Receiver Part
			Optional<Customer> receiveroption = customerRepo.findById(rid);
			
			
			// Updating Receiver
			if(informer.getSuccess().equals(true)&&  receiveroption.isPresent()) {
				
				Customer receiver = receiveroption.get();
				
				Float rclearbal = receiver.getClearbalance();
				receiver.setClearbalance(rclearbal+amount);
				informer.setMessage(informer.getMessage()+" Receiver Balance Updated");
				
			}
		}
		}
		else {
			informer.setSuccess(false);
			informer.setMessage("Receiver is in SDN List");
		}
		
		return informer;
	}

}