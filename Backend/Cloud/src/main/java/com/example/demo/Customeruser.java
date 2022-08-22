package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customeruser implements Serializable {


	private static final long serialVersionUID = -7965848960153739185L;
	
	@Id
	private Integer userid;
	@Column(unique = true)
	private String username;
	private String customerid;
	private String userpassword;

}