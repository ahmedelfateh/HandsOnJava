package com.javaarray;

public class miniInt {

    public static int findMin(int[] array) {
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < temp) {
                temp = value;
            }
        }
        return temp;
    }

}