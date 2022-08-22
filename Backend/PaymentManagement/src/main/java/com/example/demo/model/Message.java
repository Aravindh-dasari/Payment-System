package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message implements Serializable {


	private static final long serialVersionUID = -2072700608461624282L;
	
    @Id
    private String messagecode;
    private String instruction;

}
