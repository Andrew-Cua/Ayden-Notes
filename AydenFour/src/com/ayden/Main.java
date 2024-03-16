package com.ayden;

public class Main {

    public static void main(String[] args) {
        Box<Double> doubleBox = new Box<>();
        Box<String> s = new Box<>();
        Box<int[]> intArray = new Box<>();
        Box<Boolean> Boolean = new Box<>();
        int[] arr = {1,2,3,4,5,6};


        doubleBox.setVal(1.245);
        s.setVal("asdf");
        Boolean.setVal(false);
        intArray.setVal(arr);
        System.out.println(doubleBox.getVal());
        System.out.println(s.getVal());
        System.out.println(Boolean.getVal());

    }



}
