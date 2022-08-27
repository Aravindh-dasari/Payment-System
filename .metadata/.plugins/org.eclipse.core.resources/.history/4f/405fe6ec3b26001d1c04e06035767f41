package com.example.demo.Rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.TransactionRepo;
import com.example.demo.model.Informer;
import com.example.demo.model.Transaction;
import com.example.demo.service.TransactionService;

@RestController
public class TransactionRestController {
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	@Autowired
	private TransactionService service;
	
	@GetMapping("/transaction/{id}")
	public Transaction listTransaction(@PathVariable Integer id) {
		
		Optional<Transaction> transaction = transactionRepo.findByTransactionid(id);
		System.out.println(transaction);
		return transaction.get();
		
	}
	
	@GetMapping("/transaction")
	public List<Transaction> listTransaction() {
		
		return service.lstTransactions();
		
	}
	

	@PostMapping("/transaction")
	public Informer insertTransaction(@RequestBody Transaction usertransfer) {
		
//		Transaction transaction = new Transaction();
		Informer informer = service.insertTransaction(usertransfer);
		
		return informer;
		
	}
	
	@PutMapping("/transfer")
	public Informer makeTransaction(@RequestBody Transaction transfer) {
		
		Informer makeinformer = service.makeTransfer(transfer);
		Informer insertinformer = service.insertTransaction(transfer);
		
		makeinformer.setMessage(insertinformer.getMessage()+" "+makeinformer.getMessage());
		makeinformer.setError(insertinformer.getError()+" "+makeinformer.getError());
		if(makeinformer.getSuccess().equals(insertinformer.getSuccess())) {
			makeinformer.setSuccess(true);
		}
		
		return makeinformer;
	}

}