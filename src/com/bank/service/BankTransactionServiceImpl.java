package com.bank.service;

import com.bank.dao.BankTransactionDao;
import com.bank.dao.BankTransactionDaoImpl;
import com.bank.entity.BankAcc;
import com.bank.exception.WrongAccNumberException;

public class BankTransactionServiceImpl implements BankTransactionService{

	private BankTransactionDao dao;
	
	public BankTransactionServiceImpl() {
		dao=new BankTransactionDaoImpl(); 
	}
	
	@Override
	public String deposite(double amt,BankAcc b) throws WrongAccNumberException {
		BankAcc b1=dao.deposite(amt, b);
		return "Amount "+amt +"is deposited. Balance:"+b1.getBalance();
	}

	@Override
	public String withdraw(double amt) {
		// TODO Auto-generated method stub
		return null;
	}

}
