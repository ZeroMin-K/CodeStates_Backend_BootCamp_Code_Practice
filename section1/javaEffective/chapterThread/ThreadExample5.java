package section1.javaEffective.chapterThread;

public class ThreadExample5 {

    public static void main(String[] args) {
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Get Thread Name");
            }
        });

        thread3.start();

        System.out.println("thread3.getName() = " + thread3.getName());

        Thread thread4 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Set And Get Thread Name");
            }
        });

        thread4.start();

        System.out.println("thread4.getName() = " + thread4.getName());

        thread4.setName("Code States");
        System.out.println("thread4.getName() = " + thread4.getName());

        Thread thread5  = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread5.start();
        System.out.println(Thread.currentThread().getName());

    }
}
