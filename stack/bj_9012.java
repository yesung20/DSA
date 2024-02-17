package com.CodingTest;

import java.util.Scanner;
import java.util.Stack;

public class bj_9012 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String input = sc.next();
            String[] arr = input.split("");
            for(int j=0; j<arr.length; j++){
                if(arr[j].equals("(")){
                    stack.push(arr[j]);
                }
                else {
                    int size = stack.size();
                    if(size == 0){
                        stack.push(arr[j]);
                        break;
                    }
                    else
                        stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            stack.clear();
        }
    }
}
