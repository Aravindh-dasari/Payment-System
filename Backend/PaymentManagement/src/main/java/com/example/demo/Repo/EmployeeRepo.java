package com.example.demo.Repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	Employee findByEmployeeid(Integer id);
//	List<Employee> findAllById(Integer id);

}