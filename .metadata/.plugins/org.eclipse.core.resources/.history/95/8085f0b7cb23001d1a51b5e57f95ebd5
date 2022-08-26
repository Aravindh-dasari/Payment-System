package com.example.demo.Repo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {
	
	// Find to fetch Data
	Customer findByCustomerid(String id);
//	Customer findByAccountholdername(String name);

}
