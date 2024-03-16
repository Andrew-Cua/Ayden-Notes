package com.ayden;


import javax.swing.event.ListDataListener;

public class Main {


    public static void main(String[] args) {
        List list = new ArrayList();

        for(int i = 0; i<25; i++) {
            list.append(i);
        }

        System.out.println(list.has(30));
        list.printList();


        List list2 = new ArrayList();
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        list2.copyArray(arr);
        list2.printList();

        List list3 = new LinkedList();
        list3.copyArray(arr);

        list3.printList();


    }
}


