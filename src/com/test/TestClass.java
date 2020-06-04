package com.test;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        long out = solve(arr, N);
        System.out.println(out);
    }
    public static long solve(long[] arr, long N) {
        Arrays.sort(arr);
        long count =0;
        for (int i=0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] == (arr[j] * arr[j])) && i!=j) {
                    System.out.println((i+1) +" "+(j+1));
                    count += 1;
                }
            }
        }
        return count;
    }
}
