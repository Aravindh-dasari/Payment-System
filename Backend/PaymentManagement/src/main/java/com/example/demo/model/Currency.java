package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency implements Serializable {


	private static final long serialVersionUID = 6885621578844847075L;
	
	@Id
	private String currencycode;
	private String currencyname;
	private Float conversionrate;

}
