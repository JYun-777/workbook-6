package com.pluralsight.finance;

import com.pluralsight.interfaces.IValuable;

public class BankAccount implements IValuable, Comparable<IValuable> {
    String accountNumber;
    String name;
    double balance;

    public BankAccount(String _name, String _accountNumber, double _balance){
        this.name = _name;
        this.accountNumber = _accountNumber;
        this.balance = _balance;
    }

    //withdraw from bankaccount, fails if balance is negative
    public void withdraw (double amount){

    }

    //adds to balance in account
    public void deposit (double amount){
        balance += amount;
        System.out.printf("\nDeposit successful, new balance is %.2f\n", balance);
    }

    @Override
    public double getValue(){
        return this.balance;
    }

}
