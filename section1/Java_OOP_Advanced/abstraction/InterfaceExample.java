package section1.Java_OOP_Advanced.abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User();         // User 클래스 객체생성
        // user.callProvider(new Provider());      // Provider 객체 생성후 매개변수로 전달
        user.callProvider(new Provider2());     // Provider 객체 생성후 매개변수로 전달
    }

}

class User {
//    public void callProvider(Provider provider) {   // Provider 객체를 매개변수로 받는 callProvider 메서드
//        provider.call();
//    }

    public void callProvider(Provider2 provider) {
        // Provider 객체를 매개변수로 받는 callProvider 메서드
        provider.call();
    }
}

//class Provider {
//    // Provider 클래스
//    public void call(){
//        System.out.println("무야호");
//    }
//}

class Provider2 {
    // Provider클래스
    public void call() {
        System.out.println("야호");
    }
}