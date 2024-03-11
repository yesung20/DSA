package com.algorithm;

import java.util.Scanner;

public class combinationTest {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            com(arr, visited, 0, n, i);
        }
    }
    static void com(int[] arr, boolean[] visited, int depth, int n, int r){
        if(r==0){
            print(arr, visited, n);
            return;
        }
        if(depth==n){
            return;
        }
        visited[depth] = true;
        com(arr, visited, depth+1, n, r-1);
        visited[depth] = false;
        com(arr, visited, depth+1, n, r);
    }
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
