package dailyCodingJava;

import java.util.*;

public class Q06LetterCapitalize {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1);

        String output2 = letterCapitalize("java   is good ");
        System.out.println(output2);
    }

    public static String letterCapitalize(String str){
        // 빈문자열 입력시
        if (str.length() == 0) {
            return "";                      // 빈 문자열 리턴
        }

        // 공백을 구분으로 문자열 나누기
        String[] words = str.split(" ");
        System.out.println("단어별로 split: " + Arrays.toString(words));
        String result = "";

        // 나눈 문자열 순회
        for (int i = 0; i < words.length; i++) {
            // 공백이면
            if (words[i].isEmpty()) {
                // 공백
                words[i] = words[i];
            } else {
                // 단어이면 - 첫글자는 대문자로
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }

        result = String.join(" ", words);
        return result;

    }

}
