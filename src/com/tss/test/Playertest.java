package com.tss.test;

import com.tss.entity.Player;

public class Playertest {

    public static void main(String[] args) {
        Player p1 = new Player(1,"Hardik",20,20000);
        System.out.println("Avarage Run : "+p1.avgrun());
        p1.display();




    }
}
