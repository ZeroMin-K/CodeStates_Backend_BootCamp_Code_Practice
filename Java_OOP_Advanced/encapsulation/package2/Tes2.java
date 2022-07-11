package Java_OOP_Advanced.encapsulation.package2;

// 파일명 Test2.java
import Java_OOP_Advanced.encapsulation.package1.Parent;

class Child extends Parent {
    // package1으로부터 Parent 클래스 상속
    public void printEach() {
        // System.out.println(a);       에러발생
        // System.out.println(b);
        System.out.println(c);      // 다른 패키지의 하위 클래스
        System.out.println(d);
    }
}

public class Tes2 {
    public static void main(String[] args) {
        Parent p = new Parent();

        // System.out.println(p.a);    // public을 제외한 모든 호출 에러
        // System.out.println(p.b);
        //System.out.println(p.c);
        System.out.println(p.d);
    }
}
