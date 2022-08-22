package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logger implements Serializable {

	private static final long serialVersionUID = -6119720432330096404L;
	
    @Id
    private  int loggerid;
    private String customerid;
    private int userid;
    private int employeeid;
    private String screename;
    private String action;
    private String ipaddress;

}
