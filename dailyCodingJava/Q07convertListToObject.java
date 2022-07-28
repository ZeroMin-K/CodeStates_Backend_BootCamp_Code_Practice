package dailyCodingJava;

import java.util.*;

public class Q07convertListToObject {
    public HashMap<String, String> convertListToHashMap(String[][] arr) {
        // 해시맵 생성
        HashMap<String, String> hashMap = new HashMap<>();
        // 2차원 배열을 순회하며
        for (String[] words : arr) {
            if (words.length != 0) {
                String key = words[0];
                if (!hashMap.containsKey(key)){
                    String value = words[1];
                    hashMap.put(key, value);
                }
            }
        }

        return hashMap;
        // 한원소의 길이가 0이 아니면
        // 해시맵의 기존에 키가 없으면
        // 키 넣어줌
        // 원소의 [0]은 키
        // 원소의 [1]은 value
        // 해시맵에 put

        // 해시맵 리턴
    }
}
