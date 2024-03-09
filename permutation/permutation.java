package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class permutationTest_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        boolean[] visited = new boolean[n];
        int[] arr = new int[n];
        int[] output = new int[r];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        per1(arr, output, visited, 0, n ,r);    //dfs 활용
        System.out.println();
        per2(arr, 0, n, r);     //swap 활용
    }
    static void per1(int[] arr, int[] output, boolean[] visited, int depth, int n, int r){
        if(depth == r){
            System.out.println(Arrays.toString(output));
            return;
        }
        for(int i=0; i<n; i++){
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = arr[i];
                per1(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    static void per2(int[] arr, int depth, int n, int r){
        if(depth == r){
            print(arr, r);
            return;
        }
        for(int i=depth; i<n; i++){
            swap(arr, depth, i);
            per2(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }
    static void swap(int[] arr, int depth,int i){
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    static void print(int[] arr, int r){
        for(int i=0; i<r; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
