package com.example.demo.Rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.model.Employee;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> listEmployee(@PathVariable Integer id) {
		
		Optional<Employee> emp = employeeRepo.findById(id);
		System.out.println(emp);
		return emp;
		
	}
	
	@GetMapping("/allemployee/")
	public List<Employee> listEmployee() {
		
		List<Employee> emp = employeeRepo.findAll();
		System.out.println(emp);
		return emp;
		
	}
	

}
