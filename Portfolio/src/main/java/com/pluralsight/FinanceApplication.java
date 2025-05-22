package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.interfaces.IValuable;

public class FinanceApplication {
    public static void main(String[] args){

        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        IValuable account2 = new BankAccount("456", "Gary", 1500);

        Portfolio port = new Portfolio();
        port.add(account1);
        port.add(account2);
        port.getMostValuable();
        port.getLeastValuable();



        /*try {
            BankAccount depAccount = null;
            //try to deposit money into both accounts
            if (account1 instanceof BankAccount) {
                depAccount = (BankAccount) account1;
            }
            depAccount.deposit(100);
            if (account2 instanceof BankAccount) {
                depAccount = (BankAccount) account2;
            }
            depAccount.deposit(100); //fails because IValuable doesn't have deposit
        }catch(Exception e){
            System.out.println("Account not found");
        }*/
    }
}
