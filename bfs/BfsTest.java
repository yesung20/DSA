package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BfsTest {  //큐 사용 
    public static void main(String[] args) {
        boolean[] visited = new boolean[9];
        int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};
        System.out.println(bfs(1, graph, visited));
    }

    static String bfs(int start, int[][] graph, boolean[] visited){
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int nodeIndex = q.poll();
            sb.append(nodeIndex + " -> ");
            for(int node : graph[nodeIndex]){
                if(!visited[node]){
                    visited[node] = true;
                    q.offer(node);
                }
            }
        }
        return sb.toString();
    }

}
