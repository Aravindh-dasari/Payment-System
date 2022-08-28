package com.example.demo.model;

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
	public int getLoggerid() {
		return loggerid;
	}
	public void setLoggerid(int loggerid) {
		this.loggerid = loggerid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getScreename() {
		return screename;
	}
	public void setScreename(String screename) {
		this.screename = screename;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Logger [loggerid=" + loggerid + ", customerid=" + customerid + ", userid=" + userid + ", employeeid="
				+ employeeid + ", screename=" + screename + ", action=" + action + ", ipaddress=" + ipaddress + "]";
	}
    
    

}
