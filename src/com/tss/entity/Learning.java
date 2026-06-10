package com.tss.entity;

public class Learning {
    private  int a;
    private  static  int b;




    public  Learning(){
        a=0;
        b=0;
    }





    public  void increment(){
        a++;
        b++;
    }

    public void display(){
        System.out.println("a ="+a);
        System.out.println("b = "+b);
    }

}
