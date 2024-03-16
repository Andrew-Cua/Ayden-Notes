package com.ayden;

public class LinkedListNode {
    private int data;
    private LinkedListNode nextNode;

    public LinkedListNode() {
        data = 0;
        nextNode = null;
    }

    public LinkedListNode(int data, LinkedListNode node) {
        this.data  = data;
        this.nextNode = node;
    }

    public LinkedListNode(int data) {
        this.data = data;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public int getData() {
        return data;
    }
}
