package section1.Java_OOP_Advanced.abstraction;

public final class FinalEx {        // 확장/상속 불가능한 클래스
    final int x = 1;        // 변경되지 않는 상수

    final void getNum() {
        // 오버라이딩 불가한 메서드
        final int localVar = x;     // 상수
    }
}
