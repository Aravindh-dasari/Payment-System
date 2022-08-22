package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {


	private static final long serialVersionUID = -551415711712716378L;
	
	@Id
	private Integer employeeid;
	private String employeename, employeepassword;

}
