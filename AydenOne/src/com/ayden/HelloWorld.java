package com.ayden;

public class HelloWorld {

    public static void main(String args[]) {
        /* String example: */
        String str = "Hello World";
        /* strings in Java are not primitive types
        *  this is because they are a character sequence.
        *
        *  Note: String begins with a capital letter.
        * */

        /* Useful String methods */

        str.length(); // Gets the length of the string

        String s = str.toUpperCase(); // creates a new uppercase version of the string

        str.toLowerCase(); // creates a new lowercase version

        int index = 0;
        str.charAt(index); // gets the character at a certain index.


        /* Exercise */
        // create two integer variables, a, b and c
        int a = 2;
        int b = 3;
        int c = 0;
        // add a and b together, store in c
        c = a+b;
        // print c
        System.out.println(c);
        // subtract a and b
        c = a-b;
        // print c
        System.out.println(c);
        // multiply
        c = a *b;
        System.out.println(c);
        // subtract
        c = b-a;
        System.out.println(c);
        // modulo
        c = a % b;
        System.out.println(c);

        while(a < b) {
            System.out.println(a);
            a++;

        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }


    }
}
