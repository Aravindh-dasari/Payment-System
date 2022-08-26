package com.example.demo.model;

import java.io.Serializable;

public class Informer implements Serializable {

	private static final long serialVersionUID = 6182688902788170979L;
	
	private Boolean success;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Informer [success=" + success + "]";
	}
	
	

}
