package com.CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2309{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        boolean[] visited = new boolean[9];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        combination(arr, visited, 0, 9, 7);
    }
    static void combination(int[] arr, boolean[] visited, int depth, int n, int r){
        if(r == 0){
            print(arr, n, visited);
            return;
        }
        if(depth == n){
            return;
        }
        visited[depth] = true;
        combination(arr, visited, depth+1, n, r-1);
        visited[depth] = false;
        combination(arr, visited, depth+1, n, r);
    }
    static void print(int[] arr, int n, boolean[] visited)  {
        int sum = 0;
        for(int i=0; i<n; i++){
            if(visited[i]){
                sum += arr[i];
            }
        }
        if(sum==100){
            for(int i=0; i<n; i++){
                if(visited[i]){
                    System.out.println(arr[i]);
                }
            }
            System.exit(0);
        }
        else{
            return;
        }
    }
}
