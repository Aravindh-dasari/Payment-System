package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.model.Employee;
import com.example.demo.model.Informer;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee/{id}")
	public Employee listEmployee(@PathVariable Integer id) {
		
		Employee emp = employeeRepo.findByEmployeeid(id);
		System.out.println(emp);
		return emp;
		
	}
	
//	@RequestMapping(value = "/auth/password/*", method = RequestMethod.GET)
//	@PathVariable Integer id, String password
	@PostMapping("/auth/password")
	public Informer Checkpass(@RequestBody Employee employee) {
		System.out.println(employee);
		Integer id = employee.getEmployeeid();
		String password = employee.getEmployeepassword();
		return service.passCheck(id, password);
		
	}
	
	@GetMapping("/employee")
	public List<Employee> listEmployee() {
		
		return service.AllEmp();
		
	}
	

}
