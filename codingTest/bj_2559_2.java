package com.CodingTest;

import java.util.Scanner;

public class bj_2559_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        int[] psum = new int[N+1];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            psum[i+1] = psum[i] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=N-k; i++){
            max = Math.max(max, psum[i+k] - psum[i]);
        }
        System.out.println(max);
    }
}
