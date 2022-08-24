package com.example.demo.Rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.BankRepo;
import com.example.demo.model.Bank;


@RestController
public class BankRestController {
	
	@Autowired
	private BankRepo bankRepo;
	
	@GetMapping("/bank/{bic}")
	public String listBank(@PathVariable String bic) {
		
		Optional<Bank> bank = bankRepo.findByBic(bic);
		if(bank.isPresent()) {
			
			System.out.println(bank.get());
			return bank.get().getBankname();
		
		}
		
		return "Enter Valid BIC";
		
	}

}
