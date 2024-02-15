package com.CodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj_10773 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size = 0;
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            int input = sc.nextInt();
            if(input==0){
                arr.remove(size-1);
                size--;
            }
            else{
                arr.add(input);
                size++;
            }
        }
        int sum=0;
        for(int i=0; i<arr.size(); i++){
            sum = sum + arr.get(size-1);
            size--;
        }
        System.out.println(sum);
    }
}
