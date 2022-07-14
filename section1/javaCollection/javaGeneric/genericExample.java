package section1.javaCollection.javaGeneric;

class Flower {}
class Rose extends Flower{}
class RosePasta {}

class Basket <T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class genericExample {
    public static void main(String[] args) {
        Basket<Flower> flowerBasket = new Basket<>();
        flowerBasket.setItem(new Rose());       // 다형성 적용
        // flowerBasket.setItem(new RosePasta());  // 에러

    }
}
