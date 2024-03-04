package com.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class DfsTest_2 {  //스택이용 
    static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        stack.push(input);
        visited[input] = true;
        while(!stack.isEmpty()){
            int nodeIndex = stack.pop();
            System.out.print(nodeIndex + " -> ");
            for(int linkedNode : graph[nodeIndex]){
                if(!visited[linkedNode]){
                    stack.push(linkedNode);
                    visited[linkedNode] = true;
                }
            }
        }
    }
}
