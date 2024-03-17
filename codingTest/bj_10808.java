package com.CodingTest;

import java.util.Scanner;

public class bj_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String input = sc.next();
        for(int i=0; i<input.length(); i++){
            int temp = 0;
            temp = (int)input.charAt(i);
            temp = temp - 97;
            arr[temp]++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
