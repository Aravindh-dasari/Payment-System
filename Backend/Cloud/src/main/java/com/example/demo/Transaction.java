package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction implements Serializable {


	private static final long serialVersionUID = -5264972240503367075L;
	
    @Id
    private int transactionid;
    private String customerid;
    private String currencycode;
    private String senderBIC;
    private String receiverBIC;
    private String receiveraccountholdernumber;
    private String receiveraccountholdername;
    private Boolean transfertypecode;
    private String messagecode;
    private Float currencyamount;
    private Float tranferfees;
    private Float inramount;
    private Date transferdate;

}
