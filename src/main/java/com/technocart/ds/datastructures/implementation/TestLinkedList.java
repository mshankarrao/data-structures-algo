package com.technocart.ds.datastructures.implementation;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.insertAtIndex(23,0);
        linkedList.insertAtIndex(17,2);
        linkedList.prepend(37);
        linkedList.printList();
        System.out.println(linkedList.searchInList(47));

    }
}
