package com.ayden;

public abstract class List {
    protected int size = 0;

    public List() {

    }


    public abstract void append(int num);
    public abstract int get(int pos);
    public abstract void remove(int pos);
    public abstract boolean has(int num);

    public int getSize() {
        return size;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i) + ", ");
        }

        System.out.println("");
    }

    public void copyArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            append(arr[i]);
        }
    }
}
