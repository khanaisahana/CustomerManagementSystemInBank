package com.model;

public class Customer {

	private long customerSSN;
	private String  customerName;
	private String customerEmail;
	private String  customerAddress;
	private String customerContactNumber;
	private String  customerAadharNumber;
	private String customerPanNumber;
	private String  customerAccountNumber;
	private long depositAmount;
	
	public Customer(long customerSSN, String customerName, String customerEmail, String customerAddress,
			String customerContactNumber, String customerAadharNumber, String customerPanNumber,
			String customerAccountNumber, long depositAmount) {
		super();
		this.customerSSN = customerSSN;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerContactNumber = customerContactNumber;
		this.customerAadharNumber = customerAadharNumber;
		this.customerPanNumber = customerPanNumber;
		this.customerAccountNumber = customerAccountNumber;
		this.depositAmount = depositAmount;
	}
	
	
	public long getCustomerSSN() {
		return customerSSN;
	}
	public void setCustomerSSN(long customerSSN) {
		this.customerSSN = customerSSN;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerContactNumber() {
		return customerContactNumber;
	}
	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}
	public String getCustomerAadharNumber() {
		return customerAadharNumber;
	}
	public void setCustomerAadharNumber(String customerAadharNumber) {
		this.customerAadharNumber = customerAadharNumber;
	}
	public String getCustomerPanNumber() {
		return customerPanNumber;
	}
	public void setCustomerPanNumber(String customerPanNumber) {
		this.customerPanNumber = customerPanNumber;
	}
	public String getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(String customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public long getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(long depositAmount) {
		this.depositAmount = depositAmount;
	}
	

}

