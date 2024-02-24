package com.ayden;

public class Main {


    public static void main(String[] args) {
        Functions functions = new Functions();

        // Write your code below
        functions.sayHello();

        System.out.println(functions.add(1,4));


        int[] a = {1,2,3,4,5};

        // create a function inside Functions.java that accepts an integer array as a parameter
        // and copies the values of that array into a NEW array. Return the new array.
        int[] b = functions.copyArray(a);

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(b[i] + ", ");
        }


        // create a function that accepts an integer array and an integer number. Add that integer number to the end of
        // the array. This function does not need to return anything, but you may need to create a new array.
        int[] c = functions.append(a,7);
        System.out.println("");
        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }

        int[] d = functions.addAt(a,6, 2);
        System.out.println("");
        for(int i = 0; i < d.length; i++) {
            System.out.print(d[i] + ", ");
        }

        int[] e = functions.removeAt(d,2);
        System.out.println("");
        for(int i = 0; i < e.length; i++) {
            System.out.print(e[i] + ", ");
        }
    }
}
