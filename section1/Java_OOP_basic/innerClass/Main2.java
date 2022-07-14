package section1.Java_OOP_basic.innerClass;

class Outer2 {
    // 외부 클래스
    private int num = 3;        // 내부 클래스의 인스턴스 변수
    private static int sNum = 4;

    void getPrint() {
        System.out.println("인스턴스 메서드");
    }

    static void getPrintStatic() {
        System.out.println("스태틱 메서드");
    }

    static class StaticInClass {
        // 정적 내부 클래스
        void test() {
            System.out.println("Outer num = " + sNum + "(외부 클래스의 정적 변수)");
            getPrintStatic();
            // num과 getPrint()는 정적멤버가 아니라 사용 불가
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Outer2.StaticInClass a = new Outer2.StaticInClass();    // 정적 이너 클래스의 객체 생성
        a.test();
    }
}