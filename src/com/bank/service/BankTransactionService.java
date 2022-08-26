package com.bank.service;

import com.bank.entity.BankAcc;
import com.bank.exception.WrongAccNumberException;

public interface BankTransactionService {

	public String deposite(double amt,BankAcc b)throws WrongAccNumberException; 
	public String withdraw(double amt);
	
}
