package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfertypes implements Serializable {

	private static final long serialVersionUID = 3873863335946422592L;
	
	@Id
    private String tranfertypecode;
    private String transfertypedescription;
	
    
	public String getTranfertypecode() {
		return tranfertypecode;
	}
	public void setTranfertypecode(String tranfertypecode) {
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
