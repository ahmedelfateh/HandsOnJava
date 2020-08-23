package com.startOOP;

public class Box {

    private int hight;
    private int length;
    private int width;

    public Box(int hight, int length, int width) {
        this.hight = hight;
        this.length = length;
        this.width = width;
    }

    public void Dimensions() {
        System.out.println("The Trunk Dimensions are " + hight + length + width);
    }

    public int getHight() {
        return hight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

}