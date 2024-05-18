package com.ayden;

import java.util.function.Consumer;
import java.util.function.Predicate;

/***
 * it can append things
 * it has negative positions
 * it can remove things
 * You can check if something is inside the list
 * taking a certain position of the list
 */
public class ArrayList<T> extends List<T> {

    // member variables
    private T[] array = (T[]) new Object[9];
    public ArrayList() {

    }
    public ArrayList(T[] array) {
        this.array = array;
    }

    @Override
    public void append(T t) {
        if (size < array.length) {
            array[size] = t;
            size++;
            return;
        }

        System.out.println("Making new array");
        T[] temp = (T[])new Object[array.length+10];
        int last_pos = array.length;
        for(int i = 0; i <array.length; i++){
            temp[i] = array[i];
        }
        temp[last_pos] = t;

        array = temp;



    }


    public void printList() {
        for(int i=0; i< size; i++ ) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("");
    }

    /**
     *  Get the element at position pos.
     *  If pos is negative, get the number from the back of the list
     **/
    @Override
    public T get(int pos){
        if(pos<0){
            int negativeSize = size + pos;
            if (negativeSize < 0) {
                throw new IndexOutOfBoundsException("Pos is out of bounds");
            }
            return array[negativeSize];
        }

        if (pos > size) {
            throw new IndexOutOfBoundsException("Pos is out of bounds");
        }

        return array[pos];
    }


    // 1,2,3,4,5,6,7,8
    // 1,2,3,5,5,6,7,8,0
    // 1,2,3,5,6,6,7,8,0
    // 1,2,3,5,6,7,7,8,0
    // 1,2,3,5,6,7,8,8,0
    // 1,2,3,5,6,7,8,0,0
    @Override
    public void remove(int pos) {
        if(pos>size)
            throw new IndexOutOfBoundsException("Pos is out of bounds");
        for(int i=pos;i<size;i++){
            array[i] = array[i+1];
        }
        size--;
    }

    // a = 10;
    // check if 10 is in the array
    @Override
    public boolean has(T a){
        for(int i=0; i<size;i++){
            if (array[i] == a){
                return true;
            }
        }


        return false;
    }

    private void superSecret() {
        System.out.println("No one should be able to call me");
    }

    /**
     * Iterate through every element.
     * Appplys a function to every element
     */
    public void map(Consumer<T> c) {
        for(int i = 0; i < size; i++) {
            c.accept(array[i]);
        }
    }


    /* Go over every element,
    * if it passes the predicate, add it to the new arraylist
    * otherwise, nothing
    *
    * return the new arrayList
    * */
    public ArrayList<T> filter(Predicate<T> p) {
        ArrayList<T> arr = new ArrayList<>();
        for(int i = 0; i <size; i++){
            if(p.test(get(i))) {
                arr.append(get(i));
            }
        }

        return arr;
    }














}
