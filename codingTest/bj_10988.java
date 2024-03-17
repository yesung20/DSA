package com.CodingTest;

import java.util.Scanner;

public class bj_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == sb.charAt(i)){
                continue;
            }
            else{
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}
