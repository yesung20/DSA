package com.algorithm;

import java.util.Scanner;

public class permutationTest_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        boolean[] visited = new boolean[n];     //방문 체크리스트
        int[] arr = new int[n];     //입력 배열
        int[] output= new int[r];   //순열 출력 배열
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        per2(arr, output, visited, 0, n, 3);
    }
    static void per2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r){
        if(depth == r){
            print(output, r);
            return;
        }
        for(int i=0; i<n; i++){
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = arr[i];
                per2(arr, output, visited, depth, n, r);
                visited[i] = false;
            }
        }
        
    }
    static void print(int[] arr, int r) {
        for(int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
