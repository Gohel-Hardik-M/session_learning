package com.tss.entity;

public class Savingsaccount extends Account{
    int min_balance = 500;

    public Savingsaccount(){

    }
    public Savingsaccount(String name, String accountType, int min_balance) {
        super(name, accountType);
        this.min_balance = min_balance;
    }

    public  boolean  withdraw(int ammount){
        if(ammount>getBalance()){
            return false;

        }
        if ((getBalance()-ammount)<min_balance){
            return false;
        }
        else {
            setBalance(getBalance()-ammount);
            return true;
        }

    }
}
