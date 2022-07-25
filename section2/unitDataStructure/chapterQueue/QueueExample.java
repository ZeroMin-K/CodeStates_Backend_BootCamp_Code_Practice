package section2.unitDataStructure.chapterQueue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();  // int형 queue 생성

        // queue에 값 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.toString());

        // queue에서 데이터 제거
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue.toString());

    }
}
