package com.example.demo.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.CustomerRepo;
import com.example.demo.model.Customer;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@GetMapping("/customer/{id}")
	public Customer listCustomer(@PathVariable String id){
		
		Customer query = customerRepo.findBycustomerid(id);
//		System.out.println(query);
		return query;
	
	}

}
