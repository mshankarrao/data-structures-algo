package com.technocart.ds.datastructures.basic;

public class StringReverseWithCondition {

    public static void main(String[] args) {
        System.out.println(reverseAlphaNumeric("A!B10C!S5%"));
    }

    public static char[] reverseAlphaNumeric(String string) {
        char[] c = string.toCharArray();
        char temp = ' ';
        for (int i = 0, j = c.length - 1; i < c.length/2; ) {

            if (!((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= '0' && c[i] <= '9') )) {
                i++;
            } else if (((c[j] >= 'a' && c[j] <= 'z') || (c[j] >= 'A' && c[j] <= 'Z') || (c[j] >= '0' && c[j] <= '9'))) {
                temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            else
            {
                j--;
            }

        }
        return c;
    }
}
