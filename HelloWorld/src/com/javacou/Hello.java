package com.javacou;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int numOne = 5;

        System.out.println(numOne);
        System.out.println(Integer.MAX_VALUE);

        float numTwo = (float) 2.25; // =2.25f;
        System.out.println(numTwo);

        double numThree = 2.45;
        System.out.println(numThree);

        if ((numOne != numTwo) && (numTwo != numThree)) {
            System.out.println("This is good!");
        }

        boolean isCar = true;
        isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("There is no car.");
        }

        switch (numOne) {
            case 5:
                System.out.println("the number is: 5");
                break;

            default:
                System.out.println("The number is wrong!");
                break;
        }

        if (numOne == 5) {
            System.out.println("this is true");
        } else if (numOne == 50) {
            System.out.println("Nop numOne = 50");
        } else {
            System.out.println("There is no correct value");
        }

        // var data = calcInterest(500, 2);
        // System.out.println(data);

        for (int i = 1; i < 5; i++) {
            var data = calcInterest(500, i);
            System.out.println(data);
        }

        double i = 1;
        while (i < 5) {
            i++;
            var interest = 500 * (i / 100);
            System.out.println(interest);
            if (i == 3) {
                System.out.println("break at 3");
                break;
            }
        }

        Scanner userInput = new Scanner(System.in);
        System.out.println("set your name: ");
        String name = userInput.nextLine();
        System.out.println("Hi, " + name);
        userInput.close();
    }

    public static double calcInterest(double cash, double rate) {
        double interest = 0;

        interest = cash * (rate / 100);

        return interest;
    }
}