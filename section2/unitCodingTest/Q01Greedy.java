package section2.unitCodingTest;

import java.util.*;

public class Q01Greedy {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3

        int result = movingStuff(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(result); // 4
    }

    public static int movingStuff(int[] stuff, int limit) {
        // 입력1: int[] stuff: 40이상 240 이하 자연수 담은 배열 - 짐 무게들
        // 입력2: int limit: 40이상 240이하 자연수 - 박스 무게 제한
        // 출력: int타입 리턴 - 모든 짐을 옮기기위해 필요한 박스개수 최소값
        // 박스가 작아서 최대 2개의 짐, 무게제한
        // 최대한 박스 적게 사용하여 짐 옮기기

        // 현재 박수 개수
        int boxCount = 0;

        // 짐 배열 정렬
        Arrays.sort(stuff);

        // 짐 리스트 생성
        ArrayList<Integer> stuffList= new ArrayList<>();
        // 짐리스트에 짐 배열 짐들 삽입
        for(int item: stuff) {
            stuffList.add(item);
        }

        // 현재 박스 무게
        int weight = 0;
        // 현재 박스 내부 짐 개수
        int stuffCount = 0;

        // 가장 무거운짐을 가벼운짐이랑 합칠 수 있는지
        // 합칠수 있으면 합치고,
        // 안되면 박스 하나 증가

        // 짐 무게 arraylist가 다 빌때까지 - 짐을 다 옮길때까지
        while(!stuffList.isEmpty()) {
            // 현재짐 무게  - 가장 무거운짐 - 리스트 맨뒤에 있음
            int currentStuff = stuffList.get(stuffList.size() -1);

            // 현재짐 빼고 나머지 다 박스에 넣었을 때
            if(stuffList.size() == 1) {
                // 현재짐 제거
                stuffList.remove(stuffList.size() -1);
                // 박스 개수 증가
                boxCount++;
                continue;
            }

            // 가벼운 짐이랑 합쳤을 때 limit보다 작으면 - 이때 짐이 적어도 2개 이상
            if((stuffList.get(0) + currentStuff) <= limit) {
                // 같이 박스에 넣고 짐 리스트에서 제거
                stuffList.remove(stuffList.size() -1);		// 현재 짐 제거
                stuffList.remove(0);											// 현재 마지막 짐 제거
                boxCount++;																// 현재 박스개수 증가
            }
            // 가벼운 짐이랑 합쳤을 때 limit 보다 크면
            else {
                stuffList.remove(stuffList.size() -1);		// 현재 짐 제거
                boxCount++;																// 현재 박스 개수 증가
            }
        }
        // 박스 개수 return
        return boxCount;

    }
}
