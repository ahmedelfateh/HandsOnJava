package com.startOOP;

public class Main {
    public static void main(String[] args) {

        Car newCar = new Car(4, 5, "green", "fiat", "toyota");
        Car newCarMe = new Car("red", "fiat", "toyota");

        System.out.println(newCar.getColor());
        System.out.println(newCarMe.getColor());

        newCar.carRun(50);

        Trunk newTrunk = new Trunk(4, 5, "green", "fiat", "toyota", 5, 10, new Box(10, 20, 30));
        System.out.println(newTrunk.getTrunkBack());
        newTrunk.carRun(90000);
        // newTrunk.getRealBox().Dimensions();
        newTrunk.privateGetRealBox();
    }
}