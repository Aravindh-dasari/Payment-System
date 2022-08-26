package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Repo.TransactionRepo;
import com.example.demo.model.Transaction;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	public Boolean makeTransaction(String customerid, String acholdernumber, Boolean typecode, String msgcode, Float currencyamount) {
		
		if()
		Transaction transaction = new Transaction();
		transaction.setTransfertypecode(typecode);
		transaction.setMessagecode(msgcode);
		transaction.setCurrencyamount(currencyamount);
		
		transactionRepo.save(transaction);
		return true;
	}

}
