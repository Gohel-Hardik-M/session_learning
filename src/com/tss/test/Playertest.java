package com.tss.test;

import com.tss.entity.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Playertest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Player> playerList = new ArrayList<Player>();

        int operation;
        while(true) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("\n\nChoose Operation To Perform : ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1. Create Player");
            System.out.println("2. Print States Table");
            System.out.println("6. Exit");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------");


            while (true) {
                if (scanner.hasNextInt()) {
                    operation = scanner.nextInt();
                    break;
                } else {
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("WARNING : Invalid Number");
                    System.out.println("          Please Enter Valid Number");
                    System.out.println("-------------------------------------------------------------------------");
                    scanner.next();
                }
                System.out.println("-------------------------------------------------------------------------");

                System.out.println("Please select the operation : ");
                System.out.println("-------------------------------------------------------------------------");

            }

            switch (operation) {
                // craete player
                case 1:
                    Player newPlayer = createPlayer(scanner);
                    playerList.add(newPlayer);
                    System.out.println("-------------------------------------------------------------------------");

                    System.out.println("Account created successfully !!!");
                    System.out.println("-------------------------------------------------------------------------");


                    newPlayer.displayPlayer();

                    break;

                // display state table
                case 2:
                    for(Player p : playerList){
                        p.displayPlayer();
                        if(p.getMatches() == 0){
                            System.out.println("Average is : " + 0);
                        }else{
                            p.calculateAverage();
                        }
                        System.out.println();
                    }
                    break;


                default:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------");

                    System.out.println("Program Exited");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------------");

                    return;
            }


        }

    }

    public static int takeInput(Scanner scanner){
        int value;
        while(true){
            if(scanner.hasNextInt()){
                value = scanner.nextInt();
                if(value < 0) {
                    System.out.println("-------------------------------------------------------------------------");


                    System.out.println("WARNING : Please enter positive value ");
                    System.out.println("-------------------------------------------------------------------------");

                }else{
                    break;
                }
            }else{
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("WARNING : Please enter valid input (num).");
                System.out.println("-------------------------------------------------------------------------");
            }
        }
        return value;
    }

    public static Player createPlayer(Scanner scanner){
        String name;
        int id, runs, wickets, matches;

        scanner.nextLine();
        name = scanner.nextLine();

        System.out.print("--->> Enter runs of the player : ");
        runs = takeInput(scanner);



        System.out.print("--->> Enter wickets of the player : ");
        wickets = takeInput(scanner);

        System.out.print("--->> Enter matches of the player : ");
        matches = takeInput(scanner);

        return new Player(name, matches, runs, wickets);
    }

}
