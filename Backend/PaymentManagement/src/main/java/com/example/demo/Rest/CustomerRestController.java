package com.example.demo.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/{id}")
	public List<Object> listCustomer(@PathVariable String id){
		
		ArrayList<Object> arr = service.lst(id);
		return arr;
	}
	
	@GetMapping("/customers/")
	public List<Customer> customers(){
		
		return service.AllCustomers();
	}
}
