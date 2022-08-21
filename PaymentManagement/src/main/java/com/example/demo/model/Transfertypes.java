package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfertypes implements Serializable {

	private static final long serialVersionUID = 3873863335946422592L;
	
	@Id
    private Boolean tranfertypecode;
    private String transfertypedescription;

}
