package com.technocart.ds.datastructures.codefights;

import java.util.Arrays;

class Alphabets
{
    public static void main(String args[])
    {
        char ch;

        for (ch = 'A'; ch <= 'Z'; ch++)
            System.out.println(ch);

        String[] gs = new Alphabets().newNumeralSystem('G');
        System.out.println(Arrays.toString(gs));
    }


    String[] newNumeralSystem(char number) {
        char[] a = new char[26];
        String[] result = new String[100];
        int i =0, count = 0;
        for(char ch = 'A';ch<='Z';ch++)
        {
            if(ch==number)
            {
                count = i;
            }
            a[i] = ch;
            i++;

        }

        result[0] = "A + "+ Character.toString(number);

        for(int t =1; t<count-1;t++)
        {
            for(int j =1;j<count;j++)
            {
                if(count==t+j)
                {
                    result[t] = Character.toString(a[t]) + " + " + Character.toString(a[j]);
                }
            }
        }

        return result;
    }

}