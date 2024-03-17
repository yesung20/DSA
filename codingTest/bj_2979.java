package com.CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[100];
        for(int i=0; i<3; i++){
            int arrive = sc.nextInt();
            int leave = sc.nextInt();
            for(int j=arrive; j<leave; j++){
                arr[j]++;
            }
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                sum = sum + A;
            }
            else if(arr[i] == 2){
                sum = sum + B * 2;
            }
            else if(arr[i] == 3){
                sum = sum + C * 3;
            }
        }
        System.out.println(sum);
    }
}
