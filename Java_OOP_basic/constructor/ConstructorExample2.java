package Java_OOP_basic.constructor;

public class ConstructorExample2 {
    public static void main(String[] args) {
        Car2 c = new Car2("Model X", "RED", 250);
        System.out.print("My car is " + c.getModelName() + " and Color is " + c.getColor());
    }
}

class Car2 {
    private String modelName;
    private String color;
    private int maxSpeed;

    public Car2(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }
}
