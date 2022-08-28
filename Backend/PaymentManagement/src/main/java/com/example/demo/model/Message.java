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
    
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Message [messagecode=" + messagecode + ", instruction=" + instruction + "]";
	}
    
    

}
