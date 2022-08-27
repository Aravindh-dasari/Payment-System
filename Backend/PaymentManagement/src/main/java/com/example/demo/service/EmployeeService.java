package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.model.Employee;
import com.example.demo.model.Informer;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Informer passCheck(Integer id,String userpassword) {
		
		Employee record = employeeRepo.findByEmployeeid(id);
		Informer informer = new Informer();
		
		System.out.println("Correct Password:"+ record.getEmployeepassword());
		String correct = record.getEmployeepassword();
		System.out.println(correct.equals(userpassword));
		
		if(correct.equals(userpassword)) {
			
			informer.setSuccess(true);
			informer.setMessage("Sucess Login");
		}
		
		else {
			
			informer.setSuccess(false);
			informer.setMessage("Failed Login");
			
		}
		
		return informer;
	}
	
	public List<Employee> AllEmp(){
		
		List<Employee> emp = employeeRepo.findAll();
//		System.out.println(emp);
		return emp;
		
	}

}
