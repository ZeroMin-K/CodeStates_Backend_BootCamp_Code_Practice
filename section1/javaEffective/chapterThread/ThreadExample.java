package section1.javaEffective.chapterThread;

public class ThreadExample {
    public static void main(String[] args) {

        // Runnable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();

        // Runnable 구현 객체를 인자로 전달하면서 Thread 클래스를 인스턴스화하여 스레드 생성
        Thread thread1 = new Thread(task1);

        // 한 줄 축약 가능
        // Thread thread1 = new Thread(new ThreadTask1());

        // 작업 스레드 실행. run() 내부 코드 처리
        thread1.start();

        // 코드 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}

// Runnable 인터페이스를 구현하는 클래스
class ThreadTask1 implements Runnable {

    // run()메서드 바디에 스레드가 수행할 작업 내용 작성
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}
