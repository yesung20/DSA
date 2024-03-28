package com.CodingTest;

import java.util.Scanner;

public class bj_1940 {  //완전탐색
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i] + arr[j] == M)cnt++;
            }
        }
        System.out.println(cnt);
    }
}
