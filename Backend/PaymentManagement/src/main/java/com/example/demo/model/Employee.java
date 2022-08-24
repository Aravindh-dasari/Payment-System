package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {


	private static final long serialVersionUID = -551415711712716378L;
	
	@Id
	private Integer employeeid;
	private String employeename, employeepassword;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeepassword() {
		return employeepassword;
	}
	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeepassword="
				+ employeepassword + "]";
	}
	
	

}
