package com.CodingTest;

import java.util.Scanner;
public class bj_4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int cnt = 1;
            int ret = 1;
            while(true) {
                if (cnt % n == 0) {
                    System.out.println(ret);
                    break;
                } else {
                    cnt = (cnt % n) * (10 % n) + 1;
                    ret++;
                }
            }
        }
    }
}
