package com.CodingTest;

import java.util.Scanner;

public class bj_1629 {
    static int C = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong();
        long exponent = sc.nextLong();
        C = sc.nextInt();

        long result = pow(base, exponent);
        System.out.println(result);
    }

    public static long pow(long base, long exponent){
        if(exponent == 1){
            return base;
        }

        long temp = pow(base, exponent / 2);

        if(exponent % 2 == 1){
            return (temp * temp % C) * base % C;
        }

        return temp * temp % C;
    }
}
