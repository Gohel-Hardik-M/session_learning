package com.tss.test;

import com.tss.entity.Fourwheeler;
import com.tss.entity.Twowheeler;
import com.tss.entity.Vehicle;

import java.util.Scanner;

public class Vehicletest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------- Select Vehicle Type ---------");
        System.out.println("============================================");
        System.out.println("1 ---->>> Two Wheeler Vehicle ");
        System.out.println("2 ---->>> Four Wheeler Vehicle ");
        System.out.println("============================================");
        int user_choice = sc.nextInt();

        switch (user_choice){
            case 1:
                Twowheeler t1 = new Twowheeler();

                System.out.println("Enter Mileage :");
                System.out.println("============================================");
                int m = sc.nextInt();
                t1.setMileage(m);

                System.out.println("============================================");
                System.out.println("Enter Company :");
                System.out.println("============================================");
                sc.nextLine(); // consume leftover newline
                String company = sc.nextLine();
                t1.setCompany(company);

                System.out.println("============================================");
                System.out.println("Enter Name :");
                System.out.println("============================================");
                String name = sc.nextLine();
                t1.setName(name);

                System.out.println("============================================");
                System.out.println("Enter Price :");
                System.out.println("============================================");
                int price = sc.nextInt();
                t1.setPrice(price);

                System.out.println("============================================");
                System.out.println("                VEHICLE DETAILS               ");
                System.out.println("============================================");
                t1.display();
                break;

            case 2:
                Fourwheeler f1 = new Fourwheeler();

                System.out.println("Enter Seats :");
                System.out.println("============================================");
                f1.setSeats(sc.nextInt());

                System.out.println("============================================");
                System.out.println("Enter Company :");
                System.out.println("============================================");
                sc.nextLine(); // consume leftover newline
                String company2 = sc.nextLine();
                f1.setCompany(company2);

                System.out.println("============================================");
                System.out.println("Enter Name :");
                System.out.println("============================================");
                String name2 = sc.nextLine();
                f1.setName(name2);

                System.out.println("============================================");
                System.out.println("Enter Price :");
                System.out.println("============================================");
                f1.setPrice(sc.nextInt());

                System.out.println("============================================");
                System.out.println("                VEHICLE DETAILS               ");
                System.out.println("============================================");
                f1.display();
                break;

            default:
                System.out.println("============================================");
                System.out.println("WARNING : ENTER VALID INPUT (1 OR 2) ");
                System.out.println("============================================");






        }

    }
}
