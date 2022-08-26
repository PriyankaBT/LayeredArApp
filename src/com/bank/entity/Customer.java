package com.bank.entity;

public class Customer {
     private long customerId;
     private String firstName;
     private String lastName;
     private String adharCardNo;
     private String panCardNo;
     private String address;
     private long phoneNo;
     private String email;
     
     public Customer() {
    	 
     }
	public Customer(long customerId, String firstName, String lastName, String adharCardNo, String panCardNo,
			String address, long phoneNo, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adharCardNo = adharCardNo;
		this.panCardNo = panCardNo;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public String getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(String adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", adharCardNo=" + adharCardNo + ", panCardNo=" + panCardNo + ", address=" + address + ", phoneNo="
				+ phoneNo + ", email=" + email + "]";
	}
     
     
}
