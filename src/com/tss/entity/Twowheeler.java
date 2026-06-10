package com.tss.entity;

public class Twowheeler extends Vehicle{
    int mileage;

    public  Twowheeler(){

    }
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Twowheeler(String name, String company, int price, int mileage) {
        super(name,company,price);
        this.mileage = mileage;
    }

    public  void display(){
        System.out.println("mileage = "+mileage);
        System.out.println("name ="+getName());
        System.out.println("company ="+getCompany());
        System.out.println("Price ="+getPrice());
    }
}
