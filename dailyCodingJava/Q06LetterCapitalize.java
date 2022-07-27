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

        String[] words = str.split(" ");
        System.out.println("단어별로 split: " + Arrays.toString(words));
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                words[i] = words[i];
            } else {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
        }

        result = String.join(" ", words);
        return result;

    }

}
