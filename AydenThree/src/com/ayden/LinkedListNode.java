package com.ayden;

public class LinkedListNode<T> {
    private T data;
    private LinkedListNode<T> nextNode;

    public LinkedListNode() {
        data = null;
        nextNode = null;
    }

    public LinkedListNode(T data, LinkedListNode<T> node) {
        this.data  = data;
        this.nextNode = node;
    }

    public LinkedListNode(T data) {
        this.data = data;
    }

    public void setNextNode(LinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public LinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public T getData() {
        return data;
    }
}
