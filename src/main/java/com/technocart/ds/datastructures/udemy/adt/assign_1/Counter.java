package com.technocart.ds.datastructures.udemy.adt.assign_1;

public class Counter {

    String name = null;
    int value = 0;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        value++;
    }

    public int getCurrentValue() {
        return value;
    }

    public String toString() {

        return name + ":" + value;
    }

}
