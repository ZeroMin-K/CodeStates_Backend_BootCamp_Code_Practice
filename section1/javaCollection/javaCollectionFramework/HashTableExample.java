package section1.javaCollection.javaCollectionFramework;

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<String, String>();

        map.put("Spring", "345");
        map.put("Summer", "678");
        map.put("Fall", "91011");
        map.put("Winter", "1212");

        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("아이디, 비밀번호 입력");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            String password = scanner.nextLine();

            if(map.containsKey(id)) {
                if(map.get(id).equals(password)) {
                    System.out.println("로그인");
                    break;
                }
                else
                    System.out.println("비밀번호 불일치");
            }
            else
                System.out.println("아이디 존재하지 않음");
        }
    }
}
