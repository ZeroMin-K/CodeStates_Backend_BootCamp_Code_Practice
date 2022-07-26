package section2.unitDataStructure.chapterGraph;

import java.util.*;

public class GraphExampleAdjacencyList {
    private ArrayList<ArrayList<Integer>> graph;

    // 빈 arraylist 그래프 생성
    public GraphExampleAdjacencyList() {
        graph = new ArrayList<>();
    }

    // 그래프에 size 만큼의 정점 추가
    public void setGraph(int size){
        // size 만큼
        for(int i = 0; i < size; i++) {
            // 빈 arraylist 추가
            graph.add(new ArrayList<Integer>());
        }
    }

    //그래프 반환
    public ArrayList<ArrayList<Integer>> getGraph() {
        return graph;
    }

    // fromVertex, toVertex 사이 간선 추가
    public void addEdge(int from, Integer to) {
        //from, to가 그래프의 크기보다 작거나, 음수일 경우 do nothing
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size())
            return;
        //from, to 정확하게 입력한 경우
        // from의 인접 리스트에 to 추가
        graph.get(from).add(to);
        // to의 인접 리스트에 from 추가
        graph.get(to).add(from);
    }

    // fromVertex, toVertex 사이 간선 존재 여부 반환
    public boolean hasEdge(int from, int to) {
        //from, to가 그래프의 크기보다 작거나, 음수일 경우
        if(from< 0 || to < 0 || from >= graph.size() || to >= graph.size())
            return false;
        //ArrayList에서 제공하는 contains 사용, boolean 타입 값 반환
        else
            return graph.get(from).contains(to);
    }

    // fromVertex, toVertex, 사이 간선 제거
    public void removeEdge(int from, int to) {
        //from, to가 그래프의 크기보다 작거나, 음수일 경우
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size())
            // do nothing
            return;
        //from의 인접 리스트가 to로 이어지는 간선 존재시
        if(graph.get(from).contains(to)) {
            //from의 인접 리스트에서 to 삭제
            graph.get(from).remove((Integer) to);
        }

        //to의 인접 리스트가 from으로 이어지는 간선 존재시
        if(graph.get(to).contains(from)) {
            //to의 인접 리스트에서 from 삭제
            graph.get(to).remove((Integer) from);
        }
    }
}
