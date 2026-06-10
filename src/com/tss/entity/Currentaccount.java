package com.tss.entity;

public class Currentaccount extends Account{
    int draft = 5000;

    public  boolean withdraw(int ammount){
        if ((getBalance()-ammount)<-5000){
            return false;
        }
       else if((getBalance()-ammount)>-5000){
            setBalance(getBalance()-ammount);
            if(getBalance()<0){
                draft+=getBalance();
                setBalance(0);
            }
            return true;
        }
        else {
            return false;
        }
    }

    public  int deposite(int ammount){
        if (draft<5000){
            if(ammount>(5000-draft)){
                ammount-=(5000-draft);
                setBalance(ammount);
                draft=5000;
            }
            else {
                draft+=ammount;
            }
        }
        else {
            setBalance(ammount);
        }
        return getBalance();

    }
}
