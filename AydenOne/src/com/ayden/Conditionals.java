package com.ayden;

import java.util.Random;
import java.util.Scanner;

public class Conditionals {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();


//        /* Write a number guessing game in java
//        *  You can use scanner.nextInt() to get user input
//        *  compare it to num below.
//        *
//        * if equal, print "Winner"
//        * if not, prompt the user two more times.
//        * */
//
//        int num = rng.nextInt(1, 11);
//        System.out.print("Guess a number between 1 and 10: ");
//        int in = scanner.nextInt();
//
//        if(in == num){
//            System.out.println("You guessed correctly!");
//        }
//        else{System.out.print("Incorrect. Try Again. ");}
//        in = scanner.nextInt();
//        if(in == num){
//            System.out.println("You guessed correctly!");
//        }
//        else{System.out.print("Incorect.Try Again.");}
//        in = scanner.nextInt();
//       if(in == num){
//           System.out.println("You guessed correctly!");
//       }
//       else{System.out.println("Incorect. You used up all two of your tries." + " The number was: " + num);}
//
//
//
//
//
//
//        System.out.printf("Your final guess was : %d \n", in);


//        int[] arr = {1,2,3,4,5,7};
//
//        /* print out all the odd indexes from arr */
//        for (int i = 0; i < arr.length; i++) {
//
//           if(i % 2 != 0) {
//               System.out.println(arr[i]);
//           }
//
//        }

        /*
        FizzBuzz:
        This is a pretty standard programming interview question.
        Implement the FizzBuzz program that prints numbers from 1 to 100. For multiples of 3, print "Fizz,"
        for multiples of 5, print "Buzz," and for numbers that are multiples of both 3 and 5, print "FizzBuzz."
         */

//        for(int i = 0; i<100; i++) {
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            if(i % 5 == 0){
//                System.out.println("Buzz");
//
//            }
//            if(i % 3 ==0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//        }




//        for(int b= 0; b <10; b++){
//            System.out.println(b);
//        }
        for(int b = 10; b > -1; b--) {
            System.out.println(b);
        }




















    }
}
