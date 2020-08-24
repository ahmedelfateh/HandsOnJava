package com.javaarray;

public class reversArray {

    public static int[] reversArrays(int[] array) {

        int maxTemp = array.length - 1;
        int halfLenght = array.length / 2;

        for (int i = 0; i < halfLenght; i++) {
            int temp = array[i];
            array[i] = array[maxTemp - i];
            array[maxTemp - i] = temp;
        }
        return array;
    }
}