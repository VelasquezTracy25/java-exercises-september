package com.tracyvelasquezsite;

import java.awt.*;
import java.util.Date;

public class PrimitiveAndRefTypes {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Hashcode: " + now.hashCode()); //1685185080
        System.out.println("GetTime: " + now.getTime()); //1599413019468
        System.out.println("Clone: " + now.clone()); //Sun Sep 06 12:23:39 CDT 2020

//Primitive example:
        byte x = 1;
        byte y = x;
        x=2;
        System.out.println(y); //prints 1 because its pulling from the first x
        y=x;
        System.out.println(y); //prints 2 because y has now been reassigned to equal the second x

//Reference example:
        Point point1 = new Point(1,1);
        Point point2 = point1; //is no the actual type it is a reference to the value
        System.out.println(point1); //prints 1,1
        System.out.println(point2);
        point1.x = 5;
        System.out.println(point1);//prints 5,1
        System.out.println(point2);//prints 1,1

    }
}
