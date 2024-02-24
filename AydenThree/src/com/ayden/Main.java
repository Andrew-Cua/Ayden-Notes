package com.ayden;

public class Main {


    public static void main(String[] args) {
        Car car = new Car(4, "red", 4);
        car.drive();
        System.out.println(car.getWheels());
    }
}


