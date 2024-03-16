package com.ayden;

public class LinkedList extends List {
    private LinkedListNode head = null;
    @Override
    public void append(int num) {
        // You add another node
        // You set the value of the new node
        // You connect it to the last node

        if (head == null) {
            head = new LinkedListNode(num);
            size++;
            return;
        }

        LinkedListNode n = new LinkedListNode(num);
        LinkedListNode temporary = head;
        // how do we get the last node
        while(temporary.getNextNode() != null) {
            temporary = temporary.getNextNode();
        }
        temporary.setNextNode(n);
        size++;


    }

    @Override
    public int get(int pos) {
        LinkedListNode tent = head;
        for(int i = 0;i < pos; i++) {
            tent = tent.getNextNode();
        }

        return tent.getData();
    }

    @Override
    public void remove(int pos) {
        LinkedListNode before_node = head;
            for(int i = 0; i<pos-1; i++){
                before_node = before_node.getNextNode();
            }

            before_node.setNextNode(before_node.getNextNode().getNextNode());



    }

    @Override
    public boolean has(int num) {
        LinkedListNode tent = head;
        while(tent != null){
            if(tent.getData() == num){
                return true;
            }
        }

        return false;
    }
}
