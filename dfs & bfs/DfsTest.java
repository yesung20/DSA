package com.algorithm;

public class DfsTest {  //재귀사용

    //방문처리에 사용할 배열
    static boolean[] visited = new boolean[9];

    //그래프의 연결 상태를 2차원 배열로 표현
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    public static void main(String[] args){
        dfs(1);
    }

    static void dfs(int nodeIndex){
        //방문처리
        visited[nodeIndex] = true;
        //방문노드출력
        System.out.print(nodeIndex + " -> ");
        //방문한 노드의 인접 노드 찾기
        for(int node : graph[nodeIndex]){
            //인접한 노드가 방문한 적이 없다면 DFS수행
            if(!visited[node]){
                dfs(node);
            }
        }
    }

}
