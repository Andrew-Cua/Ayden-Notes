package com.ayden;

public class Car {

    int numWheels;
    String color;
    int numDoors;

    public Car(int numWheels, String color, int numDoors) {
        this.numWheels = numWheels;
        this.color = color;
        this.numDoors = numDoors;

        System.out.println("Made a Car");
    }


    void drive() {
        System.out.printf("I am driving on %d wheels \n", this.numWheels);
    }

    int getWheels() {
        return this.numWheels;
    }

}
