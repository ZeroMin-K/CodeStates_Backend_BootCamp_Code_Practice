package section1.javaEffective.chapterThread;

public class ThreadExample4 {
    public static void main(String[] args) {

        // 익명 Thread 하위 객체를 활용한 스레드 생성
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        };

        thread2.start();

        for (int i =0 ; i < 100; i++) {
            System.out.print("@");
        }
    }
}
