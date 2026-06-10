package com.tss.entity;

public class Box {
   private   double width;
   private double height;
   private double depth;

    public Box(){
        width=10;
        height=30;
        depth=20;
    }

    public  Box(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }


    public  double calculate(){
        return width*height*depth;
    }

    public void display(){
        System.out.println("Height ="+height);
        System.out.println("Width ="+width);
        System.out.println("Depth ="+depth);
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }


}
