package com.technocart.ds.datastructures.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class StringUnderstanding {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2= new String("Hello");
        String s3 = "Hello";
        String s4= new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1.isEmpty());
        System.out.println(s1);
        s1 = s1.concat("Bhaiya");
        System.out.println(s1);

        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.size());

        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Hanumat");
        al.add("Ajay");
        al.add("Hanumat");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Pankaj");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2...");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
