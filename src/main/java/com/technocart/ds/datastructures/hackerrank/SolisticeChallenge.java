package com.technocart.ds.datastructures.hackerrank;

import java.util.*;

public class SolisticeChallenge {

    public static void main(String[] args) {
        int a[] = {6, 1, 3, 46, 1, 3, 9};
        int b[] = {2,3,10, 2, 4, 8,1};
        long k = 47;
        String skills = "pcmbzcmzffpbpcmbz";
        //challenge#2
        //System.out.println(differentTeams(skills));

        //challenge#2--Correct
        System.out.println(differentTeamsCorrect(skills));

        //challenge#3
        System.out.println(getNumberOfPairs(a, k));

        System.out.println(maxDifference(b));

    }

    private static int differentTeams(String skills) {
        char[] a = skills.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('p', 0);
        map.put('c', 0);
        map.put('m', 0);
        map.put('b', 0);
        map.put('z', 0);
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.get(a[i]) + 1);
        }
        return (int) new HashSet(map.values()).stream().findFirst().get();
    }

    private static int differentTeamsCorrect(String skills) {
        char[] a = skills.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('p', 0);
        map.put('c', 0);
        map.put('m', 0);
        map.put('b', 0);
        map.put('z', 0);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'p' || a[i] == 'c' || a[i] == 'm' || a[i] == 'b' || a[i] == 'z') {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        return (int) new HashSet(map.values()).iterator().next();
    }

    private static int getNumberOfPairs(int a[], long k) {

        Integer[] d = new Integer[a.length];
        int count = 0;
        int t = (int) k;
        for (int i = 0; i < a.length; i++) {
            d[i] = Integer.valueOf(a[i]);
        }
        Set<Integer> targetSet = new HashSet();
        Collections.addAll(targetSet, d);
        List<Integer> finalCount = new ArrayList();
        List<Integer> temp = new ArrayList();
        Collections.addAll(temp, d);
        for (int i = 0; i < a.length; i++) {
            if (targetSet.contains(t - a[i]) && !finalCount.contains(a[i]) &&
                    !finalCount.contains(t - a[i])) {
                {
                    if (a[i] == k - a[i]) {
                        int num = Collections.frequency(temp, a[i]);
                        if (!(num > 1)) {
                            count--;
                        }
                    }
                    count++;
                    finalCount.add(a[i]);
                    finalCount.add(t - a[i]);
                }
            }

        }
        return count;
    }

    static int maxDifference(int[] a) {
        int d1 = 0, d2 = 0, n2 = 0, n1 = 0;
        for (int k = 1; k < a.length - 1; k++) {
            for (int p1 = k, p2 = k + 1; p1 >= 1; p1--) {
                n1 = a[p1];
                n2 = a[p2];
                d2 = n2 - n1;
                if (d2 >= d1) {
                    d1 = d2;
                }
            }
        }
        return d1 + 1;
    }
}
