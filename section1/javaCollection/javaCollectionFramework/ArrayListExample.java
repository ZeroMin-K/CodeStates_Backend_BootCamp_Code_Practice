package section1.javaCollection.javaCollectionFramework;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 생성하여 list에 할당
        List<String> list = new ArrayList<String>();

        // String 타입의 데이터를 ArryList에 추가
        list.add("Java");
        list.add("egg");
        list.add("tree");

        // 저장된 총 객체 수 얻기
        int size = list.size();

        // 0번 인덱스의 객체얻기
        String skill = list.get(0);

        // 저장된 총 객체수 만큼 조회
        for(int i =0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        // for-each문으로 순회
        for(String str: list) {
            System.out.println(str);
        }

        // 0번 인덱스 객체 삭제
        list.remove(0);
    }
}
