package com.tss.test;

import com.tss.entity.Account;
import com.tss.entity.Currentaccount;
import com.tss.entity.Savingsaccount;

import java.util.Scanner;

public class AccountTest {


    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                        STATE BANK OF INDIA            ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Account a1 = new Account();

        System.out.println("Enter Account Type (Savings - 1, Current - 2) :");
        if(sc.nextInt()==1){
            Savingsaccount s1 = new Savingsaccount();
        }
        else {
            Currentaccount c1 = new Currentaccount();
        }
        System.out.println("Enter Your Name :");
        a1.setName(sc.nextLine());


        System.out.println("Enter Balance :");
        a1.setBalance(sc.nextInt());

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1 - View Account Details.");
        System.out.println("2 - Check Balance.");
        System.out.println("3 - Deposite Ammount.");
        System.out.println("4 - Withdraw Ammount.");
        System.out.println("5 - Exit.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        boolean user_countinue = true;
        while (user_countinue) {
            System.out.println("Enter Your Choice :");
            int user_choice = sc.nextInt();
            switch (user_choice){
                case 1:
                    a1.accountDetails();
                    System.out.println("----------------------------------------------------------------------------------------");

                    break;
                case 2:
                    System.out.println("Your Current Balance :"+a1.checkbalance());
                    System.out.println("----------------------------------------------------------------------------------------");

                    break;
                case  3:
                    System.out.println("Enter Ammount to Deposity :");
                    if(sc.nextInt()>=0) {
                        a1.deposite(sc.nextInt());
                        System.out.println("Updated Balance :" + a1.checkbalance());
                    }
                    else {
                        System.out.println("Invalid Input");
                    }

                    System.out.println("----------------------------------------------------------------------------------------");


                    break;
                case 4:
                    System.out.println("Enter Ammount to Withdraw :");
                    if(sc.nextInt() >=0){
                    if(a1.withdraw(sc.nextInt())) {
                        System.out.println("Updated Balance :" + a1.checkbalance());
                    }
                    else {
                        System.out.println("----------- INSUFFICIENT BALANCE ------------------------");
                    }

                    }
                    else {
                        System.out.println("Warning : Invalid Input");
                    }
                    System.out.println("----------------------------------------------------------------------------------------");

                    break;
                case 5:
                    user_countinue=false;
                default:
                    System.out.println("Invalid Operation");
            }
        }


            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("After All the Activity Your Account Status is as below :");
            System.out.println();
            a1.accountDetails();
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("                             THANK YOU                                     ");
            System.out.println("---------------------------------------------------------------------------");








    }

}
