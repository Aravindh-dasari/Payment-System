package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customeruser implements Serializable {


	private static final long serialVersionUID = -7965848960153739185L;
	
	@Id
	private Integer userid;
	@Column(unique = true)
	private String username;
	private String customerid;
	private String userpassword;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Customeruser [userid=" + userid + ", username=" + username + ", customerid=" + customerid
				+ ", userpassword=" + userpassword + "]";
	}
	
	

}