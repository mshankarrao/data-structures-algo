package com.technocart.ds.datastructures.basic;

import java.util.HashSet;

public class SumOfTwoNumbersInArray {

    public static void main(String[] args) {

        int[] a = {1,2,4,4};
        System.out.println(sumPresent(a,8));
    }

    public static boolean sumPresent(int[] a, int k)
    {
        int min =0,max=a.length-1;
        for (int i = 0;i<a.length;i++)
        {
            if(a[min]+a[max] == k)
            {
               return true;
            }
            else if(a[i]+a[max] > k)
            {
                max--;
            }
            else {
                min++;
            }
        }
        return false;

    }
}
