package section1.javaEffective.chapterLambda;

@FunctionalInterface
interface MyFunctionalInterface2 {
    public void accept(int x);
}

public class MyFunctionalInterfaceExample2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 example;
        example = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };

        example.accept(2);

        example = (x) -> System.out.println(x * 5);
        example.accept(2);
    }
}
