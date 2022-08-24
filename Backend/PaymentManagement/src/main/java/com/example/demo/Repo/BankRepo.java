package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, String> {
	
	Optional<Bank> findByBic(String bic);

}
