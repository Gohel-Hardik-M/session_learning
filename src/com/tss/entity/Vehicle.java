package com.tss.entity;

public class Vehicle {
    private   String name;
    private   String company;
    private   int price;

    public Vehicle(){
        name="Honda XYZ";
        company="TATA";
        price=20000;
    }

    public  Vehicle(String name,String company,int price){
        this.name=name;
        this.company=company;
        this.price=price;
    }

    public String getName() {
        return name;
    }


    public String getCompany() {
        return company;
    }


    public int getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void display(){
        System.out.println("name ="+name);
        System.out.println("company ="+company);
        System.out.println("Price ="+price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
