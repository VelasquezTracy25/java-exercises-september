package com.tracyvelasquezsite;

import java.util.Arrays;

public class ArraysExamples {
    int[] numbers;

    public static void main(String[] args) {

        //long way:
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println("Numbers: " + Arrays.toString(numbers)); //toString needs java.uti.Arrays;

        //newer way:

        int[] newNumbers = {1, 2, 3, 4, 5};

        System.out.println("NewNumbers: " + Arrays.toString(newNumbers));

        String[] dcMembers = {"Beyonce", "Kelly", "Michelle", "Farrah"};
        Arrays.sort(dcMembers);
//        Arrays.fill(dcMembers, "Beyonce");
        System.out.println(dcMembers);

        System.out.println(Arrays.toString(dcMembers));



    }
}
