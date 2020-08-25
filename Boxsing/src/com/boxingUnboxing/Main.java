package com.boxingUnboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList<int> intArrayList = new ArrayList<int>(); // <<<< this will return
        // error

        ArrayList<intClass> intArrayList = new ArrayList<intClass>();
        intArrayList.add(new intClass(50));
        System.out.println(intArrayList);

        Integer num = 56; // <<<< Integer.valueOf(56);
        int numValue = num.intValue(); // <<<< num.intValue()

        ArrayList<Integer> intOkList = new ArrayList<Integer>();
        intOkList.add(50);
        // intOkList.add(Integer.valueOf(50)); // <<<< autoboxing
        System.out.println(intOkList);

        for (int i = 0; i < 10; i++) {
            intOkList.add(i);
        }
        System.out.println(intOkList);

        for (int i = 0; i < 10; i++) {
            System.out.println("the num is: " + intOkList.get(i));
            // System.out.println("the num is: " + intOkList.get(i).intValue(); // <<<<
            // autoUnboxing
        }
    }
}