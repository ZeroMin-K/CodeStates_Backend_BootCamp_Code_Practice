package weeklyReview.july0725_0729.dataStructure.stack;

import java.util.ArrayList;

public class StackExampleArrayList {

    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    // 스택에 데이터 추가
    public void push(Integer data) {
        // Arryalist listStack에 add
        listStack.add(data);
    }

    // 가장 나중에 추가된 데이터 스택에서 삭제
    // 삭제한 데이터 리턴
    public Integer pop() {
        // arraylist liststack이 비어있으면
        if(listStack.size() == 0) {
            return null;
        } else{
            // arraylist listStack이 비어있지 않으면
            // 맨 마지막 원소 삭제
            return listStack.remove(listStack.size() -1);
        }
    }

    // 스택에 추가된 데이터 크기 리턴
    public int size() {
        // arraylist listStack의 길이 리턴
        return listStack.size();
    }

    // 가장 나중에 추가된 데이터 리턴
    public Integer peek() {
        // arraylist listStack이 비어있으면
        if(this.size() == 0) {
            return null;
        } else {
            // arraylist listStack이 비어있찌 않으면
            // 맨마지막 원소 리턴
            return listStack.get(this.size() -1);
        }
    }

    // 현재 스택에 포함되어 있는 모든 데이터를 String타입으로 변화하여 리턴
    public String show() {
        return listStack.toString();
    }

    // 현재 스택에 포함되어있는 모든 데이터 삭제
    public void clear() {
        listStack.clear();
    }
}