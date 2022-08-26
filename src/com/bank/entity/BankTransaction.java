package com.bank.entity;
import java.time.LocalDateTime;


public class BankTransaction {

	private long transactionId;
	private double amount;
	private Customer customer;// Association
	private BankAcc acnumber;
	private LocalDateTime trnTimeStamp;
	private TransactionType trType;
	
	public BankTransaction() {}
	public BankTransaction(long transactionId, double amount, Customer customer, BankAcc acnumber,
			LocalDateTime trnTimeStamp,TransactionType trType) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.customer = customer;
		this.acnumber = acnumber;
		this.trnTimeStamp = trnTimeStamp;
		this.trType=trType;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public BankAcc getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(BankAcc acnumber) {
		this.acnumber = acnumber;
	}
	public LocalDateTime getTrnTimeStamp() {
		return trnTimeStamp;
	}
	public void setTrnTimeStamp(LocalDateTime trnTimeStamp) {
		this.trnTimeStamp = trnTimeStamp;
	}
	public TransactionType getTrType() {
		return trType;
	}
	public void setTrType(TransactionType trType) {
		this.trType = trType;
	}
	@Override
	public String toString() {
		return "BankTransaction [transactionId=" + transactionId + ", amount=" + amount + ", customer=" + customer
				+ ", acnumber=" + acnumber + ", trnTimeStamp=" + trnTimeStamp + ", trType=" + trType + "]";
	}	
	
	
}
