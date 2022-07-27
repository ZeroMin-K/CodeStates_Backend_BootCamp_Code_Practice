package section2.unitDataStructure.chapterSearchAlgorithm;

import java.util.*;

public class DFSBFSExample {

    // 재귀 사용한 풀이
    public static boolean getDirectionDFS(int[][] matrix, int from , int to) {

        // 출발점과 도착점이 같다면 true 반환 - (재귀함수 도착 부분)
        if (from == to)
            return true;

        // 2차원 배열 선언
        int[][] currentMatrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++)
            currentMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);

        // 출발지점의 1차원 배열 순회
        for(int i = 0; i < currentMatrix[from].length; i++) {
            // 길 존재시
            if (currentMatrix[from][i] == 1) {
                // 해당 루트 순회 표시(1-> 0으로 변경)
                currentMatrix[from][i] = 0;
                // 표시된 행렬과 출발지점을 현재 지점인 i로 변경하여 재귀함수 실행
                // 재귀함수가 끝까지 도달시 true반환한 경우 true반환
                if(getDirectionDFS(currentMatrix, i, to))
                    return true;
            }
        }

        // 길을 찾을 수 없는 경우 false 반환
        return false;
    }

    // 큐  사용한 풀이
    public static boolean getDirections(int[][] matrix, int from , int to) {
        // 연결리스트를 사용하여 큐 선언
        Queue<Integer> queue = new LinkedList<>();

        // 첫 시작점으로 from 할당
        queue.add(from);

        // 방문했다는 것을 표시하기 위해 1차원 배열 생성
        boolean[] isVisited = new boolean[matrix.length];
        // 첫 정점 방문 여부 표시
        isVisited[from] = true;

        // queue(방문할 곳)의 사이즈가 0이 될때까지 반복
        while(queue.size() > 0) {
            // queue에서 정점을 하나 빼서 now에 할당
            int now = queue.poll();

            // 목적지인지 검사, 목적지라면 true 반환
            if (now == to)
                return true;
            // 해당 정점의 간선들 확인
            for(int next = 0; next < matrix[now].length; next++) {
                // 만약 간선이 있고 방문하지 않았다면
                if(matrix[now][next] == 1 && !isVisited[next]) {
                    // queue에 next 넣음. (다음 정점으로 가기 위해)
                    queue.add(next);
                    // 해당정점을 방문했다는 것을 표시
                    isVisited[next] = true;
                }
            }
        }
        // 길이 없으면 false 반환
        return false;
    }
}
