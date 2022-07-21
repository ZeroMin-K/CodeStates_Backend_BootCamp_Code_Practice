package section2.dsAlRecursive;

public class Gugudan {
    // 반복문으로 구현한 구구단 메서드
    public void gugudanIterative(int level) {
        for (int count = 0; count < 9; count++) {
            System.out.printf("%d x %d = %d\n", level, count, level * count);
        }
    }

    // 재귀 호출로 구현한 구구단 메서드
    public void gugudanRecursive(int level, int count) {
        if (count > 9) {
            return;
        }
        System.out.printf("%d x %d = %d\n", level, count, level * count);
        gugudanRecursive(level, ++count);
    }
}
