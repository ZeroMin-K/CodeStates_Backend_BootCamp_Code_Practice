package section1.javaCollection.javaCollectionFramework;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        // LinkedList 생성, list에 할당
        List<String> list = new LinkedList<>();

        // String타입의 데이터를 LinkedList에 추가
        list.add("Java");
        list.add("egg");
        list.add("tree");

        // 저장된 총 객체수 얻기
        int size = list.size();

        // 0번 인덱스 객체얻기
        String skill = list.get(0);

        // 저장된 총 객체 수 만큰 조회
        for(int i =0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        // for-each문으로 순회
        for(String str:list) {
            System.out.println(str);
        }

        // 0번 인덱스 객체 삭제
        list.remove(0);
    }
}
