package com.bank.presentation;

import com.bank.entity.BankAcc;
import com.bank.entity.Customer;
import com.bank.exception.WrongAccNumberException;
import com.bank.service.BankTransactionService;
import com.bank.service.BankTransactionServiceImpl;

public class UI {

	public static void main(String[] args) {
	
        Customer c1=new Customer(256800089l,"Ajay","Kale","SHDJ47585","DFHJ484","Kalyan",8956235456l,"ajay@gmail.com");
		BankAcc b1=new BankAcc(100056633,c1,5000d);
		
		BankTransactionService d=new BankTransactionServiceImpl();
		try {
			System.out.println(d.deposite(1000,b1));
		} catch (WrongAccNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
