package com.technocart.ds.datastructures.basic;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("Amar");
        hashSet.add("Shankar");
        hashSet.add("Kiran");
        hashSet.add("Sagar");
        System.out.println(hashSet.size());
        hashSet.stream().forEach(h-> System.out.println(h));

    }

}
