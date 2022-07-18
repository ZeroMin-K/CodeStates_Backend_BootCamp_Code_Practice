package section1.javaEffective.chapterLambda;

@FunctionalInterface
interface MyFunctionalInterface3 {
    public int accept(int x, int y);
}

public class MyFunctionalInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 example;
        example = (x, y) -> {
            int result = x + y;
            return result;
        };

        int result1 = example.accept(2, 5);
        System.out.println(result1);

        example = (x, y) -> {return x + y;};
        int result2 = example.accept(2, 5);
        System.out.println(result2);

        example = (x, y) -> x + y;  // return문만 있을 경우 중괄호 {]와 return 문 생략 가능
        int result3 = example.accept(2, 5);
        System.out.println(result3);

        example = (x, y) -> sum(x, y);      // return문만 있을 경우 중괄호 {}, return문 생략 가능
        int result4 = example.accept(2, 5);
        System.out.println(result4);
    }

    public static int sum(int x,  int y) {
        return x + y;
    }
}
