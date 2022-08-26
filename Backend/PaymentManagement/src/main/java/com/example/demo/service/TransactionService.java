package com.example.demo.service;

import java.util.List;

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
	
	public Informer makeTransfer(Transaction transfer) {
		
		Informer informer = new Informer();
		
		String sid = transfer.getCustomerid();
		String rid = transfer.getReceiveraccountholdernumber();
		
		// Sender Part
		Customer sender = customerRepo.findById(sid).get();
		if(sender!=null) 
		{
			informer.setMessage("Sender Found");
			Float amount = transfer.getInramount();
			Float sclearbal = sender.getClearbalance();
			
			// Updating Sender Clear Balance
			if(amount <= sclearbal) {
				
				informer.setMessage(informer.getMessage()+" Sender Balance Updated");
				sender.setClearbalance(sclearbal-amount);
				informer.setSuccess(true);
			
			}
			
			// Receiver Part
			Customer receiver = customerRepo.findById(rid).get();
			
			// Updating Receiver
			if(receiver!=null) {
				
				Float rclearbal = receiver.getClearbalance();
				receiver.setClearbalance(rclearbal+amount);
				informer.setMessage(informer.getMessage()+" Receiver Balance Updated");
				
			}
		}
		
		return informer;
	}

}