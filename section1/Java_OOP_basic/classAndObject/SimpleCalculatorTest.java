package section1.Java_OOP_basic.classAndObject;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      // 외부 입력을 받을 수 있는 Scanner 객체 생성

        System.out.println("첫번째 숫자 입력: ");
        String str1 = scan.nextLine();      // 첫번째 숫자 입력

        System.out.println("사칙 연산자 입력: ");
        String op = scan.nextLine();        // 사칙 연산자 입력

        System.out.println("두번째 숫자 입력: ");
        String str2 = scan.nextLine();       // 두번째 숫자 입력

        int num1 = Integer.parseInt(str1);       // 입력받은 첫번째 문자를 숫자형으로 변환
        int num2 = Integer.parseInt(str2);       // 입력받은 두번째 문자를 숫자형으로 변환
        int result;

        if (op.equals("+")) {   // 덧셈연산
            result = num1 + num2;
        }
        else if(op.equals("-")) {   // 뺄셈 연산
            result = num1 - num2;
        }
        else if(op.equals("/")) {   // 나누기 연산
            result = num1 / num1;
        }
        else {
            result = num1 * num2;   // 곱하기 연산
        }

        System.out.println(str1 + " " + op + " " + str2 + " = "  + result); // 결과값 출력

    }
}
