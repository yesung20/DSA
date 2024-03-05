package com.CodingTest;

import java.util.*;

public class bj_1260 {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<Integer>();
    static void dfs(int data) {
        visited[data] = true;
        System.out.print(data + " ");
        for (int node : graph.get(data)) {
            if (!visited[node]) {
                dfs(node);
            }
        }
    }

    static void bfs(int data){
        q.add(data);
        visited[data] = true;
        while(!q.isEmpty()){
            int nodeData = q.poll();
            System.out.print(nodeData + " ");
            for(int node : graph.get(nodeData)){
                if(!visited[node]){
                    visited[node] = true;
                    q.add(node);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //정점의 개수
        int M = sc.nextInt();   //간선의 개수
        int V = sc.nextInt();   //탐색 시작할 정점의 번호

        visited = new boolean[N+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int ver1 = sc.nextInt();
            int ver2 = sc.nextInt();
            graph.get(ver1).add(ver2);
            graph.get(ver2).add(ver1);
        }
        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }
}
