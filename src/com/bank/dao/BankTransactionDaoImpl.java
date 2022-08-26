package com.bank.dao;

import com.bank.entity.BankAcc;
import com.bank.exception.WrongAccNumberException;

public class BankTransactionDaoImpl implements BankTransactionDao{

	
	
	@Override
	public BankAcc deposite(double amt, BankAcc b)throws WrongAccNumberException {
		double oldamt=b.getBalance();
		double newamt=oldamt+amt;
		b.setBalance(newamt);
		return b;
	}

}
