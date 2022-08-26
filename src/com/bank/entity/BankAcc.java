package com.bank.entity;

public class BankAcc {
      private long accNumber;
      private Customer customer;
      private double balance;
      
      public BankAcc() {}
	public BankAcc(long accNumber, Customer customer, double balance) {
		super();
		this.accNumber = accNumber;
		this.customer = customer;
		this.balance = balance;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAcc [accNumber=" + accNumber + ", customer=" + customer + ", balance=" + balance + "]";
	}
      
      
      
}
