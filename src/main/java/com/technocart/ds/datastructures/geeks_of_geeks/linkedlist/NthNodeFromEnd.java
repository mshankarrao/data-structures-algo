package com.technocart.ds.datastructures.geeks_of_geeks.linkedlist;

import com.technocart.ds.datastructures.implementation.LinkedList;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(50);
        linkedList.append(60);
        linkedList.append(70);
        linkedList.append(80);
        System.out.println(linkedList.getNthNodeFromEnd(5));

    }


}
