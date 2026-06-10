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


        System.out.println("Enter Account Type (Savings - 1, Current - 2) :");
       int account_type = sc.nextInt();


       switch (account_type) {
           case 2:
               Scanner user = new Scanner(System.in);
               Currentaccount s1 = new Currentaccount();
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("--->> Your Name :");
               String name = user.nextLine();
               s1.setName(name);
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("-->> Enter Blance :");
               int user_balance = user.nextInt();
               s1.setBalance(user_balance);
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("                     SELECT OPERATIONS                                      ");

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
                   switch (user_choice) {
                       case 1:
                           s1.accountDetails();
                           System.out.println("----------------------------------------------------------------------------------------");

                           break;
                       case 2:
                           System.out.println("Your Current Balance :" +  (s1.checkbalance() == 0 ? (s1.displayDraft()-5000) : s1.checkbalance()));
                           System.out.println("----------------------------------------------------------------------------------------");

                           break;
                       case 3:
                           System.out.println("Enter Ammount to Deposity :");
                           if (sc.nextInt() >= 0) {
                               int updated = s1.deposite(sc.nextInt());
                               System.out.println("Updated Balance :" +  (s1.checkbalance() == 0 ? (s1.displayDraft()-5000) : s1.checkbalance()));
                               System.out.println("Updated Draft Balance :" + s1.displayDraft());
                           } else {
                               System.out.println("Invalid Input");
                           }

                           System.out.println("----------------------------------------------------------------------------------------");


                           break;
                       case 4:
                           System.out.println("Enter Ammount to Withdraw :");
                           if (sc.nextInt() >= 0) {
                               if (s1.withdraw(sc.nextInt())) {
                                   System.out.println("Updated Balance :" +  (s1.checkbalance() == 0 ? (s1.displayDraft()-5000) : s1.checkbalance()));
                                   System.out.println("Updated Draft Balance :" + s1.displayDraft());
                               } else {
                                   System.out.println("----------- INSUFFICIENT BALANCE OR ACCOUNT IS GETTING EMPTY FULLY ------------------------");
                               }

                           } else {
                               System.out.println("Warning : Invalid Input");
                           }
                           System.out.println("----------------------------------------------------------------------------------------");

                           break;
                       case 5:
                           user_countinue = false;
                       default:
                           System.out.println("Invalid Operation");
                   }

               }


               System.out.println("----------------------------------------------------------------------------------------");
               System.out.println("After All the Activity Your Account Status is as below :");
               System.out.println();
               s1.accountDetails();
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("                             THANK YOU                                     ");
               System.out.println("---------------------------------------------------------------------------");


           case 1:
               Scanner user2 = new Scanner(System.in);
               Savingsaccount c1 = new Savingsaccount();
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("--->> Your Name :");
               String name2 = user2.nextLine();
               c1.setName(name2);
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("-->> Enter Blance :");
               int user_balance2 = user2.nextInt();
               c1.setBalance(user_balance2);
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("                     SELECT OPERATIONS                                      ");

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

               boolean user_countinue2 = true;
               while (user_countinue2) {
                   System.out.println("Enter Your Choice :");
                   int user_choice = sc.nextInt();
                   switch (user_choice) {
                       case 1:
                           c1.accountDetails();
                           System.out.println("----------------------------------------------------------------------------------------");

                           break;
                       case 2:
                           System.out.println("Your Current Balance :" + c1.checkbalance());
                           System.out.println("----------------------------------------------------------------------------------------");

                           break;
                       case 3:
                           System.out.println("Enter Ammount to Deposity :");
                           if (sc.nextInt() >= 0) {
                             int updated =  c1.deposite(sc.nextInt());
                             System.out.println("Updated Balance :" + updated);
                           } else {
                               System.out.println("Invalid Input");
                           }

                           System.out.println("----------------------------------------------------------------------------------------");


                           break;
                       case 4:
                           System.out.println("Enter Ammount to Withdraw :");
                           if (sc.nextInt() >= 0) {
                               if (c1.withdraw(sc.nextInt())) {
                                   System.out.println("Updated Balance :" + c1.checkbalance());

                               } else {
                                   System.out.println("----------- INSUFFICIENT BALANCE OR ACCOUNT IS GETTING EMPTY FULLY ------------------------");
                               }

                           } else {
                               System.out.println("Warning : Invalid Input");
                           }
                           System.out.println("----------------------------------------------------------------------------------------");

                           break;
                       case 5:
                           user_countinue2 = false;
                       default:
                           System.out.println("Invalid Operation");
                   }

               }


               System.out.println("----------------------------------------------------------------------------------------");
               System.out.println("After All the Activity Your Account Status is as below :");
               System.out.println();
               c1.accountDetails();
               System.out.println("---------------------------------------------------------------------------");
               System.out.println("                             THANK YOU                                     ");
               System.out.println("---------------------------------------------------------------------------");

       }


    }

}
