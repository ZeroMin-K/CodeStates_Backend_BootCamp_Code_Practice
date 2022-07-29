package section2.unitCodingTest;

import java.util.*;

public class Q03Simulation {
    // hashMap을 이용해 조작에 따른 다음 이동값 바로 찾음
    public Integer boardGame2(int[][] board, String operation) {

        // 조작에 따른 다음 좌표로 이동 경로 등록
        HashMap<String, int[]> hashMap = new HashMap<>();
        hashMap.put("U", new int[] {-1, 0});
        hashMap.put("D", new int[] {1, 0});
        hashMap.put("L", new int[] {0, -1});
        hashMap.put("R", new int[] {0, 1});

        // 현재 말의 위치
        int x = 0;
        int y = 0;

        // 보드 세로 길이
        int row = board.length;
        // 보드 가로 길이
        int col = board[0].length;
        // 점수
        int sum = 0;

        // 조작 배열 하나씩 확인하며
        for(int i = 0 ; i < operation.length(); i++) {
            // 조작 배열의 다음 조작
            String move = String.valueOf(operation.charAt(i));

            // 다음 좌표 - hashMap에서 조작 키를 넣어서 다음이동좌표 얻음
            int nextX = x + hashMap.get(move)[0];
            int nextY = y + hashMap.get(move)[1];

            // 이동할 수 있으면
            if(canGo(nextX, nextY, row, col)){
                // 현재좌표 업데이트
                x = nextX;
                y = nextY;
                // 점수 합산
                sum += board[x][y];
            }  else {   // 이동 못하면
                return null;
            }
        }

        return sum;
    }

    public static boolean canGo(int x, int y, int row, int col) {
        return x >= 0 && y >= 0 && x < row && y < col;
    }

    // 처음 답
    public Integer boardGame(int[][] board, String operation) {
        // (0,0) 말 놓기 - 무조건 0
        // 말 - 상, 하,좌,우로 이동 UDLR - 띄어쓰기 없음 - 한번 움직일대마다 한칸씩 움직여서 숫자 획득  0 또는 1
        // 방문한곳 또 방문 가능  // 보드밖에 나가면 OUT => null
        // 조작의 기회 한번
        // 지나가면서 획득한 숫자의 합 구하기

        // 말의 현재 좌표
        int x = 0;
        int y = 0;

        // 다음 이동 경로 - 상, 하, 좌, 우
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // board의 크기
        // board 세로 길이
        int row = board.length;
        // board 가로 길이
        int col = board[0].length;

        // 점수 합
        int sum = 0;

        // 조작 문자열을 char 배열로 변환
        char[] operations = operation.toCharArray();

        // operation을 하나씩 순회하면서
        for(char op: operations) {
            int nextX = x;		// 다음 x좌표
            int nextY = y;		// 다음 y좌표

            switch(op) {
                // U - 위로 갔을 때
                case 'U':
                    // 다음좌표
                    nextX += dx[0];
                    nextY +=  dy[0];
                    break;

                // D - 아래로 이동
                case 'D':
                    // 다음좌표
                    nextX += dx[1];
                    nextY += dy[1];
                    break;

                // L - 왼쪽으로 이동
                case 'L':
                    // 다음 좌표
                    nextX += dx[2];
                    nextY +=  dy[2];
                    break;

                // R - 오른쪽으로 이동
                case 'R':
                    // 다음 좌표
                    nextX += dx[3];
                    nextY += dy[3];
                    break;
            }

            // 이동 가능하면
            if(move(nextX, nextY, row, col)) {
                // 좌표 이동
                x = nextX;
                y = nextY;
                // 점수 합산
                sum += board[x][y];
            } // 이동 불가능하면 null 리턴
            else
                return null;
        }

        return sum;
    }

    // 다음좌표로 이동가능한지
    public boolean move(int x, int y, int row, int col) {
        // 현재 x, y좌표가 보드안에 있으면
        if (x >= 0 && y >= 0 && x < row && y < col)
            return true;
            // 좌표 밖을 벗어나면
        else
            return false;
    }
}
