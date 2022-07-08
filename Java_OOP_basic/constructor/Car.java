package Java_OOP_basic.constructor;

public class Car {
    public String model;
    public String color;

    public Car() {} // 기본 생성자. 생성자가 없는 경우 자동 생성

    // 생성자 오버로딩
    public Car(String model, String color) {
        // 매개변수가 있는 생성자
        this.model = model;
        this.color = color;
    }

    void power() {
        System.out.println("시동");
    }

    void accelerate() {
        System.out.println("가속");
    }

    void stop() {
        System.out.println("정지");
    }
}
