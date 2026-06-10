package com.tss.test;

import com.tss.entity.Learning;

public class LearningTest {

    public static void main(String[] args) {
        Learning demo1 = new Learning();
        Learning demo2 = new Learning();
        Learning demo3 = new Learning();



        demo1.increment();
        demo2.increment();
        demo3.increment();

        demo2.display();
        demo1.display();
        demo3.display();
        demo3.display();
    }
}
