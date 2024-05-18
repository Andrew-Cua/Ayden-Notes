package com.ayden;

import java.util.function.Consumer;

public abstract class List<T> {
    protected int size = 0;

    public List() {

    }


    public abstract void append(T t);
    public abstract T get(int pos);
    public abstract void remove(int pos);
    public abstract boolean has(T  t);

    public abstract void map(Consumer<T> c);

    public int getSize() {
        return size;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i) + ", ");
        }

        System.out.println("");
    }

    public void copyArray(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            append(arr[i]);
        }
    }
}
