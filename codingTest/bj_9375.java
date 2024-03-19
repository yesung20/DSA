package com.CodingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_9375 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hash = new HashMap<>();

            for(int j=0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                hash.put(type, hash.getOrDefault(type, 0)+1); //원래 있던 값이라면 가져와서 1을 더해주고 없었다면 0을 넣고 1을 더해줌
            }

            int answer = 1;
            for(int val : hash.values()){
                answer *= val+1;
            }
            bw.write(String.valueOf(answer-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
