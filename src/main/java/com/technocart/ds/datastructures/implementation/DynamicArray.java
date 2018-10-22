package com.technocart.ds.datastructures.implementation;

import java.util.Arrays;

public class DynamicArray {

    Object arr[] = new Object[5];
    int i = 0;

    public void add(Object value) {
        if (i == arr.length) {
            arr = Arrays.copyOf(arr, 2 * arr.length);
            System.out.println(arr.length);
            arr[i] = value;
        } else
            arr[i] = value;
        i++;
    }
    public void insertAtIndex(int index, Object value) {
        if (index >= i && index < arr.length) {
            arr[index] = value;
        } else if (index >= arr.length) {
            arr = Arrays.copyOf(arr, i+ index);
            arr[index] = value;
        } else if (index < i) {
            Object temp = arr[index];
            arr[index] = value;
            for (int j = index + 1; j < i + 1; j++) {
                Object k = arr[j];
                arr[j] = temp;
                temp = k;
            }
        }
    }
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("shankar");
        dynamicArray.add("shankar1");
        dynamicArray.add("Shankar5");
        dynamicArray.add("shankar");
        dynamicArray.insertAtIndex(15,"Kiran");
        for (Object o : dynamicArray.arr) {
            System.out.println(o);
        }
    }

}
