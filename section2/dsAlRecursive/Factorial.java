package section2.dsAlRecursive;

public class Factorial {
    // 반복문으로 구현한 팩토리얼 메서드
    public int factorialIterative(int number) {
        int result = 1;
        for(int count = number; count > 0; count--) {
            result = result * count;
        }
        return result;
    }

    // 재귀 호출로 구현한 팩토리얼 메서드
    public int factorialRecursive(int number) {
        if(number <= 1) {
            return 1;
        }
        return number * factorialRecursive(number -1);
    }
}
