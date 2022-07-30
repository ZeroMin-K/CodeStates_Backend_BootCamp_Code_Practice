package weeklyReview.july0725_0729.dataStructure.queue;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();   // int형 queue 생성

        // queue에 값 추가
        for(int i =0 ; i < 5; i++) {
            queue.add(i);
        }

        System.out.println(queue.toString());

        // queue에서 데이터 제거
        for (int i = 0; i < 5; i++) {
            queue.poll();
        }

        System.out.println(queue.toString());

    }
}
