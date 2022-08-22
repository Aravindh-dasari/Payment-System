package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank implements Serializable {

	private static final long serialVersionUID = -4782486271618346357L;
	
    @Id
    private String bic;
    private String bankname;

}
