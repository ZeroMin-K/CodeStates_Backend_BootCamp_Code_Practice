package section1.javaCollection.javaGeneric;

interface Plant {}
class Flower2 implements Plant {}
class Rose2 extends Flower2 implements Plant {}

class Basket2<T extends Flower2 & Plant> {
    private T item;
}

public class genericExample2 {
    public static void main(String[] args) {
        // 인스턴스화
        Basket2<Flower2> flowerBasket = new Basket2<>();
        Basket<Rose> roseBasket = new Basket<>();

    }
}
