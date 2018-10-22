package com.technocart.ds.datastructures.implementation;

/**
 * @author shankarraomata
 */
public class LinkedList {
    //prepand is O(1)
    //append is O(n)
    //getting nth element is O(n)

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
        }
    }

    public void insertAtIndex(int data, int index) {
        Node node = new Node(data);
        int i = 0;
        if (head == null) {
            return;
        }
        if (index == 0) {
            node.next = head;
            head = node;
            return;

        }
        Node node1 = head;
        while (node1.next != null) {
            if (i == index) {
                node.next = node1.next;
                node1.next = node;
                return;
            }
            i++;
            node1 = node1.next;
        }
    }


    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public int searchInList(int value) {
        if (head == null) {
            return -1;
        }
        Node node1 = head;
        int index = 0;
        while (node1.next != null) {
            if (node1.data == value) {
                return index;
            }
            index++;
            node1 = node1.next;
        }
        return -1;

    }

}

class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }


}
