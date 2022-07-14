package section1.Java_OOP_Advanced.abstraction;

interface Animal2 {
    // 인터페이스 선언. public abstract 생략 가능
    public abstract void cry();
}

interface Pet {
    void play();
}

class Dog2 implements Animal2, Pet {
    // Animal과 Pet 인터페이스 다중 구현
    public void cry() {
        // 메서드 오버라이딩
        System.out.println("멍멍");
    }

    public void play() {
        // 메서드 오버라이딩
        System.out.println("원반던지기");
    }
}

class Cat2 implements Animal2, Pet {
    // Animal 과 Pet 인터페이스 다중 구현
    public void cry() {
        System.out.println("야옹");
    }

    public void play() {
        System.out.println("쥐 잡기 ");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}
