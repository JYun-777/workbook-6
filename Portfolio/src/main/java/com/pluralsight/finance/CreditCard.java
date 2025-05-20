package com.pluralsight.finance;

import com.pluralsight.interfaces.IValuable;

public class CreditCard implements IValuable {
    private double limit;
    private double balance;


    //makePayment: choose a BankAccount to pay off the balance with
    public void makePayment(BankAccount _source, double _amount){

    }

    //charge: charge a transaction to card balance
    public void charge(){

    }

    //getValue returns balance
    @Override
    public double getValue(){
        return this.balance;
    }
}
