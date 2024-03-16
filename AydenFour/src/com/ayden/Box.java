package com.ayden;

public class Box<T> {
    private T val;


    public void setVal(T value) {
        this.val = value;
    }

    public T getVal() {
        return val;
    }

}
