package com.ayden;

public class Functions {

    void sayHello() {
        System.out.println("Hello!");
    }

    int add(int a, int b) {
        return a + b;
    }

    int[] copyArray(int[] offbrandlist) {


        int[] array = new int[offbrandlist.length];
        for (int i = 0; i < offbrandlist.length; i++) {
            array[i] = offbrandlist[i];
        }


        return array;
    }

    /***
     * Adds @param num to te end of the array
     * @param array
     * @param num
     * @return the new array containing the contents of array + num
     */
    int[] append(int[] array, int num) {
        int[] newarray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        newarray[array.length] = num;
        return newarray;
    }

    /**
     * Adds num, to array at index pos
     * you may need to shift all the other values to the right
     * <p>
     * given: [1,2,3,4,5], 6, 2
     * new array: [1,2,6,3,4,5]
     **/
    int[] addAt(int[] array, int num, int pos) {
        int[] newerrray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newerrray[i] = array[i];
        }
        for (int i = newerrray.length - 1; i > pos; i--) {
            newerrray[i] = newerrray[i - 1];
        }
        newerrray[pos] = num;


        return newerrray;
    }

    /**
     * given: [1,2,6,3,4,5], 2
     * new array: [1,2,3,4,5]
     **/
    int[] removeAt(int[] array, int pos) {
        int[] eharray = new int[array.length - 1];

        for(int i = 0; i<pos; i++){
            eharray[i] = array[i];
        }

        for(int i = pos; i<eharray.length; i++){
            eharray[i] = array[i+1];
        }

        return eharray;
    }
}
