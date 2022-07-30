package weeklyReview.july0725_0729.dataStructure.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();       // Ingteger 형 스택 생성

        // 스택에 데이터 push
        for (int i =0 ; i <= 5; i++) {
            stack.push(i);
        }

        System.out.println(stack.toString());

        // 스택에 데이터 pop
        while (!stack.isEmpty()) {
            stack.pop();
        }

        System.out.println(stack.toString());
    }
}
