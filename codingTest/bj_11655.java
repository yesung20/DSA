package com.CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class bj_11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[str.length()];
        char[] c = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = (int)str.charAt(i);
        }
        for(int i=0; i<str.length(); i++){
            if(arr[i] > 77 && arr[i] < 91){
                arr[i] = arr[i] - 13;
            }
            else if(arr[i] > 109 && arr[i] < 123){
                arr[i] = arr[i] - 13;
            }
            else if(arr[i] > 47 && arr[i] < 58){
                continue;
            }
            else if(arr[i] == 32){
                continue;
            }
            else {
                arr[i] = arr[i] + 13;
            }
        }
        for(int i=0; i<str.length(); i++){
            c[i] = (char)arr[i];
        }
        for(char a : c){
            System.out.print(a);
        }
    }
}
