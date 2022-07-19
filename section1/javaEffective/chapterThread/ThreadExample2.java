package section1.javaEffective.chapterThread;

public class ThreadExample2 {
    public static void main(String[] args) {

        // Thread 클래스를 상속받은 클래스를 인스턴스화하여 스레드 생성
        Thread thread2 = new ThreadTask2();

        // 작업 스레드를 실행시켜 run() 내부 코드 처리
        thread2.start();

        // 코드 추가
        for(int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}

// Thread 클래스를 상속받는 클래스 작성
class ThreadTask2 extends Thread{
    // run() 메서드 바디에 스레드가 수행할 작업 내용 작성
    public void run() {
        for (int i =0 ; i < 100; i++) {
            System.out.print("#");
        }
    }
}
