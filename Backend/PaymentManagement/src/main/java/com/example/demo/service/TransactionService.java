package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Repo.TransactionRepo;
import com.example.demo.model.Transaction;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	public List<Transaction> lstTransactions(){
		
		return transactionRepo.findAll();
	}
	
	public Boolean makeTransaction(@RequestBody Transaction usertransfer ) {
		
		try {

			transactionRepo.save(usertransfer);
			
//			Transaction transaction = new Transaction();
//			transaction.setTransfertypecode(usertransfer.getTransfertypecode());
//			transaction.setMessagecode(usertransfer.getMessagecode());
//			transaction.setCurrencyamount(usertransfer.getCurrencyamount());
//			
//			transactionRepo.save(transaction);
			
			return true;
		
		}
		
		catch(Exception e){
			
			System.out.println(e);
			return false;
		}
		
	}

}
