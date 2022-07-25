package section2.unitDataStructure.chapterStack;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();       // Integer형 스택 생성

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.toString());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
    }
}
