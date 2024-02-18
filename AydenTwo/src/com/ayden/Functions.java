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
        for(int i = 0;i< offbrandlist.length;i++){
            array[i] = offbrandlist[i];
        }


        return array;
    }

    int[] append(int[] array, int num) {
        int[]newarray = new int[array.length+1];
        for(int i=0; i<array.length; i++) {
            newarray[i] = array[i];
        }
        newarray[array.length] = num;

        return newarray;
    }

    /**
     * Adds num, to array at index pos
     * you may need to shift all the other values to the right
     *
     * given: [1,2,3,4,5], 6, 2
     * new array: [1,2,6,3,4,5]
     **/
    int[] addAt(int[] array, int num, int pos) {
        // [1,2,3,4,5]
        //  0,1,2,3,5
        // [1,2,0,3,4,5]
        // [1,2,6,3,4,5]
        //  0,1,2,3,4,5

        int[] temp = new int[array.length+1];
        // copy
        for(int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        // move everything to the right of pos
        for(int i = array.length; i > pos; i--) {
            temp[i] = temp[i-1];
            // [1,2,3,4,5,0]
            // [1,2,3,4,5,5]
            // [1,2,3,4,4,5]
            // [1,2,3,3,4,5]
            // [1,2,3,3,4,5]
        }

        temp[pos] = num;
        return temp;

    }

}
