package Java_OOP_basic.innerClass;

import java.sql.SQLOutput;

class Outer3 {
    // 외부 클래스
    int num = 5;

    void test() {
        int num2 = 6;
        class LocalInClass {
            // 지역 내부 클래스
            void getPrint(){
                System.out.println(num);
                System.out.println(num2);
            }
        }

        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}

public class Main3 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        outer.test();
    }
}
