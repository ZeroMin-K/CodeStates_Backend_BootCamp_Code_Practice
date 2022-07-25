package section2.unitDataStructure.chapterQueue;

import java.util.*;

public class MyQueue {
    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    // 큐에 데이터 추가
    public void add(Integer data) {
        // arraylist listQueue에 데이터 추가
        listQueue.add(data);
    }

    // 가장 먼저 추가된 데이터를 큐에서 삭제, 삭제한 데이터 리턴
    public Integer poll() {
        // arraylist listQueue가 비어있으면
        if(this.size() == 0) {
            return null;
        }else {
            // arraylist listQueue가 비어있지 않으면
            // 맨처음 인덱스 삭제
            return listQueue.remove(0);
        }
    }

    // 큐에 추가된 데이터의 크기 리턴
    public int size() {
        // arraylist ListQueue 길이 리턴
        return listQueue.size();
    }

    // 큐에 가장 먼저 추가된 데이터 리턴
    public Integer peek() {
        // arraylist listQueue가 비어있으면
        if(this.size() == 0) {
            return null;
        }else {
            // arraylist listQueue가 비어있지 않으면
            // 맨첫번째 요소 리턴
            return listQueue.get(0);
        }
    }

    // 큐에 들어있는 모든 데이터를 String타입으로 변환하여 리턴
    public String show() {
        return listQueue.toString();
    }

    // 큐에 들어있는 모든 데이터 삭제
    public void clear() {
        listQueue.clear();
    }
}
