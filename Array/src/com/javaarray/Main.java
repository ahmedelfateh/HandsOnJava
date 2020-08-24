package com.javaarray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // int[] myData = getIntegers(5);
        // int[] sorted = sortArray.sortArrays(myData);
        // printArray(sorted);

        // int[] myData = getIntegers(5);
        // int result = miniInt.findMin(myData);
        // System.out.println("the min num is: " + result);

        // int[] myData = getIntegers(5);
        // System.out.println("the original: ");
        // printArray(myData);
        // System.out.println("\n");
        // int[] reversed = reversArray.reversArrays(myData);
        // System.out.println("the reversed: ");
        // printArray(reversed);

    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int capacity) {

        int[] array = new int[capacity];
        System.out.println("set your " + capacity + " integers only:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("data place " + i + "data value " + array[i]);
        }
    }

}