package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction implements Serializable {


	private static final long serialVersionUID = -5264972240503367075L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionid;
    private String customerid;
    private String currencycode;
    private String senderBIC;
    private String receiverBIC;
    private String receiveraccountholdernumber;
    private String receiveraccountholdername;
    private Boolean transfertypecode; // CT=0 and BT=1
    private String messagecode;
    private Float currencyamount;
    private Float tranferfees;
    private Float inramount;
    private Date transferdate;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getSenderBIC() {
		return senderBIC;
	}
	public void setSenderBIC(String senderBIC) {
		this.senderBIC = senderBIC;
	}
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public String getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}
	public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}
	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}
	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}
	public Boolean getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(Boolean transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public Float getCurrencyamount() {
		return currencyamount;
	}
	public void setCurrencyamount(Float currencyamount) {
		this.currencyamount = currencyamount;
	}
	public Float getTranferfees() {
		return tranferfees;
	}
	public void setTranferfees(Float tranferfees) {
		this.tranferfees = tranferfees;
	}
	public Float getInramount() {
		return inramount;
	}
	public void setInramount(Float inramount) {
		this.inramount = inramount;
	}
	public Date getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", customerid=" + customerid + ", currencycode="
				+ currencycode + ", senderBIC=" + senderBIC + ", receiverBIC=" + receiverBIC
				+ ", receiveraccountholdernumber=" + receiveraccountholdernumber + ", receiveraccountholdername="
				+ receiveraccountholdername + ", transfertypecode=" + transfertypecode + ", messagecode=" + messagecode
				+ ", currencyamount=" + currencyamount + ", tranferfees=" + tranferfees + ", inramount=" + inramount
				+ ", transferdate=" + transferdate + "]";
	}
    
    

}
