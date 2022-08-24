package com.example.demo.Rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.TransactionRepo;
import com.example.demo.model.Transaction;

@RestController
public class TransactionRestController {
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	@GetMapping("/transaction/{id}")
	public Transaction listTransaction(@PathVariable Integer id) {
		
		Optional<Transaction> transaction = transactionRepo.findByTransactionid(id);
		System.out.println(transaction);
		return transaction.get();
		
	}
	
//	@PathVariable String customerid, String acholdernumber, Boolean typecode, @PathVariable String msgcode, @PathVariable Float currencyamount
	@PostMapping("/transaction/")
	public Boolean insertTransaction(@RequestBody Transaction usertransfer) {
		
//		org.hibernate.Transaction tx = 
		Transaction transaction = new Transaction();
		transaction.setTransfertypecode(typecode);
		transaction.setMessagecode(msgcode);
		transaction.setCurrencyamount(currencyamount);
		
		transactionRepo.save(transaction);
		return true;
		
	}

}
