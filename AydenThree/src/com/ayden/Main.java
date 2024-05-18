package com.ayden;


import javax.swing.event.ListDataListener;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.append("Ayden");
        list.append("Andrew");

        list.map((String s) -> {
            String cat = s + " Hello";
            System.out.println(cat.toUpperCase());
        });

        List<Integer> numList = new ArrayList<>();

        numList.append(1);
        numList.append(2);

        for(int i = 3; i < 30; i++) {
            numList.append(i);
        }

        numList.map((Integer c) -> System.out.println(c));


        ArrayList<Integer> numArr = (ArrayList<Integer>)numList;
        ArrayList<Integer> evens = numArr.filter((Integer c) -> {
            return true;
        });

        evens.map(System.out::println);


        List<List<String>> l = new ArrayList<>();
        l.append(list);

        List<String> s = new ArrayList<>();
        s.append("Harrison");
        s.append("Elijah");

        l.append(s);

        /**
         * l1: [1,2,3,4,5]
         * l2: [6,7,8,9,10]
         *
         * l3: [1,2,3,4,5,6,7,8,9,10]
         * l4: [[1,2,3,4,5], [6,7,8,9,10]]
         * */

        for(int i = 0; i < l.getSize(); i++) {
            List<String> temp = l.get(i);
            temp.printList();
        }




    }
}


