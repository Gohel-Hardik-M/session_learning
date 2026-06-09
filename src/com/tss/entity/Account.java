package com.tss.entity;

import java.util.Random;

public class Account {

    Random random = new Random();
    private  int id;
    private  int accountNo;
    private String name;
    private  int balance;
    private  String accountType;

    public Account(){
        id=1;
        name="Hardik";
        accountNo=10000000 + random.nextInt(90000000);
        balance=10000000;
        accountType="Savings";
    }

    public  Account(String name,String accountType){
        this.id = 100 + random.nextInt(9000);
        this.accountNo = 10000000 + random.nextInt(90000000);
        this.name = name;
        this.accountType=accountType;
    }


    public  void setName(String name){this.name = name; this.id=100 + random.nextInt(9000);}
    public  void  setAccountType(String accountType){this.accountType=accountType; this.accountNo= 10000000 + random.nextInt(90000000);}
    public  void  setBalance(int ammount){this.balance=ammount;}

    public void  deposite(int ammount){this.balance +=ammount;}
    public void accountDetails(){
        System.out.println("Account No :"+accountNo);
        System.out.println("Account Holder :"+name);
        System.out.println("Account Type :"+accountType);
        System.out.println("Balance : ******");
    }


    public boolean withdraw(int ammount){
        if(balance>ammount){
        this.balance -=ammount;
        return true;
        }
        else {
            return false;
        }
    }
    public int checkbalance(){return  balance;}

}
