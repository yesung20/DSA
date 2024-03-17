package com.CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class bj_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        int temp = 0;
        for(int i=0; i<n; i++){
            temp = (int) str[i].charAt(0);
            temp = temp-97;
            arr[temp]++;
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 5){
                temp = i + 97;
                char c = (char) temp;
                System.out.print(c);
                count++;
            }
        }
        if(count == 0){
            System.out.println("PREDAJA");
        }
    }
}
