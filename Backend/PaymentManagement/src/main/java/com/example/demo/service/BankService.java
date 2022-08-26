package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.BankRepo;
import com.example.demo.model.Bank;
import com.example.demo.model.Informer;

@Service
public class BankService {
	
	@Autowired
	BankRepo bankRepo;
	
	public Informer lstBankname(String bic) {
		
		Informer informer = new Informer();
		
		try {
		
			Optional<Bank> bank = bankRepo.findByBic(bic);
			if(bank.isPresent()) {
				
				System.out.println(bank.get());
				informer.setMessage(bank.get().getBankname());
			
			}
			else {
	
				informer.setMessage("Enter Valid BIC");
				
			}
		}
		catch(Exception e){
			
			informer.setError(e.getLocalizedMessage());
		}
		
		return informer;
		
	}

}