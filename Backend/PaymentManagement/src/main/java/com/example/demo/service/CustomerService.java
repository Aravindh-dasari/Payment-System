package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CustomerRepo;
import com.example.demo.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
	public List<Customer> AllCustomers(){
		return customerRepo.findAll();
	}
	
	public Customer lstonecustomer(String id) {
		
		Optional<Customer> customer = customerRepo.findByCustomerid(id);
		
//		ArrayList<Object> arr = new ArrayList<Object>();
		
		Customer newcustomer = new Customer();
		
		if(customer.isPresent()) {
			
			Customer currentcustomer = customer.get();

			newcustomer.setCustomerid(currentcustomer.getCustomerid());
			newcustomer.setAccountholdername(currentcustomer.getAccountholdername());
			newcustomer.setOverdraftflag(currentcustomer.getOverdraftflag());
			newcustomer.setClearbalance(currentcustomer.getClearbalance());
			
		}
		
		return newcustomer;
	}
}
