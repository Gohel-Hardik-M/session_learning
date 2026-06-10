package com.tss.entity;

public class Fourwheeler extends Vehicle{
    int seats;

    public   Fourwheeler(){

    }
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Fourwheeler(String name, String company, int price, int seats) {
        super(name, company, price);
        this.seats = seats;
    }
    public  void  display(){
        System.out.println("Name :"+getName());
        System.out.println("COmpany :"+getCompany());
        System.out.println("Price :"+getPrice());
        System.out.println("Seats :"+seats);
    }
}
