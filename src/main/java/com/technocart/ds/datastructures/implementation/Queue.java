package com.technocart.ds.datastructures.implementation;

public class Queue {  //linear data structure
    private Node head;  //remove from head
    private Node tail; //addition happens here
    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (head != null) {
            return head.data;
        }
        return 0;
    }

    public void add(int data) {
        Node node = new Node(data);
        while (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }
    public int remove()
    {
        int data = head.data;
        head = head.next;
        if(head==null)
        {
            tail = null;
        }
        return data;
    }

}
