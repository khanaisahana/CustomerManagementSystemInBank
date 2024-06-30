package com.model;

public class CustomerRegistration {

	private String ssn_id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private String address;
	private String contactNumber;
	
	public CustomerRegistration(String ssn_id, String firstName, String lastName, String email, String password,
			String confirmPassword, String address, String contactNumber) {
		super();
		this.ssn_id = ssn_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.address = address;
		this.contactNumber = contactNumber;
	}

	

	
	public CustomerRegistration() {
		// TODO Auto-generated constructor stub
	}

	public String getSsn_id() {
		return ssn_id;
	}

	public void setSsn_id(String ssn_id) {
		this.ssn_id = ssn_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
