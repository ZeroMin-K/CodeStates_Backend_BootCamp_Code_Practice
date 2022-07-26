package section2.unitDataStructure.chapterGraph;

import java.util.*;

public class GraphExampleAdjacencyMatrix {
    private int[][] graph;

    // 그래프에 size만큼의 vertext 추가
    public void setGraph(int size) {
        graph = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
    }
    
    // 인접 행렬 정보가 담긴 그래프 배열반환
    public int[][] getGraph() {
        return graph;
    }
    
    // fromVertex, toVertex 사이 간선 추가 
    public void addEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length) 
            return;
        graph[from][to] = 1;
    }

    // fromVertex, toVertex 사이 간선 존재 여부 확인
    public boolean hasEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length)
            return false;
        else if(graph[from][to] == 1)
            return true;
        else
            return false;
    }

    // fromVertex, toVertex 사이 간선 삭제
    public void removeEdge(int from, int to) {
        if(from >= graph.length || to >= graph.length)
            return;
        graph[from][to] = 0;
    }
}
