package com.tracyvelasquezsite;

import java.util.Arrays;


public class ArraysExamples {
    int[] numbers;
    String[] dcMembers;


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

//        System.out.println(firstLast6(([1, 2, 6])); //→ true
//        System.out.println(firstLast6([6, 1, 2, 3])); //→ true
//        System.out.println(firstLast6([13, 6, 1, 2, 3])); //→ false
    }

    //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }


    public static boolean sameFirstLast(int[] nums) {
        if (nums[0] == nums[nums.length - 1] && nums.length >= 1 && nums != null){
            return true;
        }
        return false;
    }



}
