package section1.javaCollection.javaCollectionFramework;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // ArrayList 생성하여 list에 할당
        List<String> list = new ArrayList<String>();

        // String 타입의 데이터를 ArryList에 추가
        list.add("Java");
        list.add("egg");
        list.add("tree");

        Iterator<String> iterator= list.iterator();

        while(iterator.hasNext()) {     // 읽어올 다음 객체가 있다면
            String str = iterator.next();    // next()를 통해 다음 객체 읽어옴
            if (str.equals("egg")){
                iterator.remove();          // 객체를 컬렉션에서 제거
            }
        }

    }
}
