package com.ayden;

<<<<<<< HEAD
import java.util.function.Consumer;

public abstract class List<T> {
    protected int size = 0;
=======
/***
 * it can append things
 * it has negative positions
 * it can remove things
 * You can check if something is inside the list
 * taking a certain position of the list
 */
public class List {

    // member variables
    int[] array = new int[9];
>>>>>>> parent of 291a868 (LinkedLists and Polymorphism)

    public List() {

    }
<<<<<<< HEAD


    public abstract void append(T t);
    public abstract T get(int pos);
    public abstract void remove(int pos);
    public abstract boolean has(T  t);

    public abstract void map(Consumer<T> c);

    public int getSize() {
        return size;
=======
    public List(int[] array) {
        this.array = array;
>>>>>>> parent of 291a868 (LinkedLists and Polymorphism)
    }

    int append(int num){
        return 0;
    }
    int negativepositions(int num){
        return 0;
    }

<<<<<<< HEAD
    public void copyArray(T[] arr) {
        for(int i = 0; i < arr.length; i++) {
            append(arr[i]);
        }
=======
    void removestuff(int num){
>>>>>>> parent of 291a868 (LinkedLists and Polymorphism)
    }

    boolean checkstuff(int a){
        return false;
    }
    int certainpos(int oneofthem){
        return 9;
    }











}
