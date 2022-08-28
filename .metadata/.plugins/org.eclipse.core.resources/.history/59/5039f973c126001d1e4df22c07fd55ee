package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Informer;
import com.example.demo.service.BankService;


@RestController
public class BankRestController {
	
	@Autowired
	private BankService service;
	
	@GetMapping("/bank/{bic}")
	public Informer listBank(@PathVariable String bic) {
		
		Informer informer = service.lstBankname(bic);
		
		return informer;
		
	}

}
