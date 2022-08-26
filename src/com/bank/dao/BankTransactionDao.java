package com.bank.dao;

import com.bank.entity.BankAcc;
import com.bank.exception.WrongAccNumberException;

interface BankTransactionDao  {
    public BankAcc deposite(double amt,BankAcc b) throws WrongAccNumberException;
}
