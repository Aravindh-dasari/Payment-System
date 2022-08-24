package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customeruser;

@Repository
public interface CustomeruserRepo extends JpaRepository<Customeruser, Integer> {
	
	

}
