package com.startOOP;

public class Trunk extends Car {

    private int trunkBack;
    private int seetsNum;
    private Box realBox;

    public Trunk(int door, int wheels, String colour, String model, String engine, int trunkBack, int seetsNum,
            Box realBox) {

        super(door, wheels, colour, model, engine);
        this.trunkBack = trunkBack;
        this.seetsNum = seetsNum;
        this.realBox = realBox;
    }

    public int getTrunkBack() {
        return trunkBack;
    }

    public void setTrunkBack(int trunkBack) {
        this.trunkBack = trunkBack;
    }

    public int getSeetsNum() {
        return seetsNum;
    }

    public void setSeetsNum(int seetsNum) {
        this.seetsNum = seetsNum;
    }

    @Override
    public void carRun(int kilo) {
        // TODO Auto-generated method stub
        // super.carRun(kilo);
        System.out.println("this is how trunk move " + kilo + "k/h");
    }

    public void privateGetRealBox() {
        getRealBox().Dimensions();
        System.out.println("this is private");
    }

    private Box getRealBox() {
        return realBox;
    }

}