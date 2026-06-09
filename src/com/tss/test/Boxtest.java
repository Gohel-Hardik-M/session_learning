package com.tss.test;

import com.tss.entity.Box;

public class Boxtest {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println("Area :"+b1.calculate());
        b1.display();
        System.out.println();
        System.out.println();
        Box b2 = new Box(100,200,500);
        System.out.println("Area = "+b2.calculate());
        b2.display();
    }

}
