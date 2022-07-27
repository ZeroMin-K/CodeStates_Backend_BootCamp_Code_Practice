package section2.unitDataStructure.chapterSearchAlgorithm;

import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {

    }

    // 인접 행렬 만들기
    public int[][] createMatrix(int[][] edges) {
        // 정점 개수 찾기
        int vertexCount = 0;

        // 간선 순회 - 간선의 개수만큼 반복
        for(int i = 0; i < edges.length; i++) {
            for(int j = 0; j < edges[i].length; j++) {
                // 최대 크기의 정점 => 총 정점 개수
                if (vertexCount < edges[i][j]) {
                    vertexCount = edges[i][j];
                }
            }
        }

        // 정점 개수 + 1 만큼의 그래프 2차원 배열 생성 - (0번재 정점부터 ~ 최대크기 정점 => 정점개수 + 1)
        int[][] graph = new int[vertexCount+1][vertexCount+1];      // 배열의 모든 요소는 0으로 만들어짐

        // 간선 하나씩 확인하며
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];     // 출발정점
            int to = edges[i][1];       // 도착 정점
            int direction = edges[i][2];        // 방향

            // 양방향 연결
            if(direction == 1) {
                // 출발, 도착 정점 서로 연결
                graph[from][to] = 1;
                graph[to][from] = 1;
            } else {    // 단방향 연결
                // 출발 -> 도착 정정만 연결
                graph[from][to] = 1;
            }
        }

        return graph;

    }
}
