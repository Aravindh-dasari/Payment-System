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
	public Boolean getTranfertypecode() {
		return tranfertypecode;
	}
	public void setTranfertypecode(Boolean tranfertypecode) {
		this.tranfertypecode = tranfertypecode;
	}
	public String getTransfertypedescription() {
		return transfertypedescription;
	}
	public void setTransfertypedescription(String transfertypedescription) {
		this.transfertypedescription = transfertypedescription;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Transfertypes [tranfertypecode=" + tranfertypecode + ", transfertypedescription="
				+ transfertypedescription + "]";
	}
    
    

}
