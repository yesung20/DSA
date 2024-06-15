package com.CodingTest;

import java.util.Scanner;
import java.util.Stack;

public class bj_3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for(int i=0; i<N; i++){
            Stack<Character> stack = new Stack<>();
            String s = sc.next();
            for(char ch : s.toCharArray()){
                if(stack.size() != 0 && ch == stack.peek()){
                    stack.pop();
                    continue;
                } else {
                    stack.push(ch);
                }
            }
            if(stack.size() == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
