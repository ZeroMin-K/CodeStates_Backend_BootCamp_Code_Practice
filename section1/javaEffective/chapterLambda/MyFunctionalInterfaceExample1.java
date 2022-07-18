package section1.javaEffective.chapterLambda;

public class MyFunctionalInterfaceExample1 {
    public static void main(String[] args) throws Exception{
        MyFunctionalInterface example;
        example = () -> {
            String str = "첫번째 메서드 호출";
            System.out.println(str);
        };
        example.accept();

        example = () -> System.out.println("두번째 메서드 호출");
        // 실행문이 하나라면 중괄호 {} 생략가능
        example.accept();

    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    public void accept();
}