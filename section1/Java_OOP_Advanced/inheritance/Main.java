package section1.Java_OOP_Advanced.inheritance;

public class Main {
    public static void main(String[] args) {
        Bike2 bike = new Bike2();     // 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();

        Vehicle2 bike2 = new Bike2();     // 상위 클래스 타입으로 선언 + 각각 타입으로 객체 생성
        Vehicle2 car2 = new Car();
        Vehicle2 motorBike2 = new MotorBike();

        bike2.run();
        car2.run();
        motorBike2.run();

        System.out.println();
        System.out.println();

        Vehicle2[] vehicles = new Vehicle2[] { new Bike2(), new Car(), new MotorBike()};
        for (Vehicle2 vehicle : vehicles) {
            vehicle.run();
        }
    }
}

class Vehicle2{
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike2 extends Vehicle2 {
    void run() {
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle2 {
    void run() {
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle2 {
    void run() {
        System.out.println("MotorBike is running");
    }
}
