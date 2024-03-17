package com.CodingTest;

import java.util.HashMap;
import java.util.Scanner;

public class bj_1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<String, Integer> st = new HashMap<>();
        HashMap<Integer, String> in = new HashMap<>();
        for(int i=0; i<N; i++){
            String s = sc.next();
            st.put(s, i+1);
            in.put(i+1, s);
        }
        for(int i=0; i<M; i++){
            String s = sc.next();
            if(stoi(s)){
                int temp = Integer.parseInt(s);
                System.out.println(in.get(temp));
            }
            else{
                System.out.println(st.get(s));
            }
        }

    }
    static boolean stoi(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
