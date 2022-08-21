package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {


	private static final long serialVersionUID = 3279317141328730989L;
	
    @Id
    private String customerid;
    private String accountholdername;
    private String overdraftflag;
    private Float clearbalance;
    private String customeraddress;
    private String customercity, customertype;

}
