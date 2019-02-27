package com.bank.model;

import java.io.Serializable;

public class Customer implements Serializable {
	private String customername;
	private long accountnumber;
	private String password;
	private long adhaar;
	
	private long mobilenumber;
	private String address;
	public Customer()
	{
		
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*@Override
	public String toString() {
		return "Customer [customername=" + customername + ", accountnumber=" + accountnumber + ", adhaar=" + adhaar
				+ ", mobilenumber=" + mobilenumber + ", address=" + address + "]";
	}*/
	
	
}
