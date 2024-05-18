package com.ayden;

import java.util.function.Consumer;

public class LinkedList<T> extends List<T> {
    private LinkedListNode<T> head = null;
    @Override
    public void append(T t) {
        // You add another node
        // You set the value of the new node
        // You connect it to the last node

        if (head == null) {
            head = new LinkedListNode<T>(t);
            size++;
            return;
        }

        LinkedListNode<T> n = new LinkedListNode<T>(t);
        LinkedListNode<T> temporary = head;
        // how do we get the last node
        while(temporary.getNextNode() != null) {
            temporary = temporary.getNextNode();
        }
        temporary.setNextNode(n);
        size++;


    }

    @Override
    public T get(int pos) {
        LinkedListNode<T> tent = head;
        for(int i = 0;i < pos; i++) {
            tent = tent.getNextNode();
        }

        return tent.getData();
    }

    @Override
    public void remove(int pos) {
        LinkedListNode<T> before_node = head;
            for(int i = 0; i<pos-1; i++){
                before_node = before_node.getNextNode();
            }

            before_node.setNextNode(before_node.getNextNode().getNextNode());



    }

    @Override
    public boolean has(T t) {
        LinkedListNode<T> tent = head;
        while(tent != null){
            if(tent.getData() == t){
                return true;
            }

            tent = tent.getNextNode();
        }

        return false;
    }

    public void map(Consumer<T> c) {

    }
}
