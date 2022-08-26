package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/{id}")
	public Customer listCustomer(@PathVariable String id){
		
		Customer customer = service.lstonecustomer(id);
		return customer;
	}
	
	@GetMapping("/customer")
	public List<Customer> customers(){
		
		return service.AllCustomers();
	}
}
