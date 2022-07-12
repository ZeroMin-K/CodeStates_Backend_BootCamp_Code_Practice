package Java_OOP_Advanced.polymorphism;

class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다");
    }
}

class BoyFriend extends Friend {
    public void friendInfo() {
        System.out.println("나는당신의 남자친구입니다");
    }
}

class GirlFriend extends Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다");
    }
}

public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend();       // 객체 타입과 참조변수 타입의 일치
        BoyFriend boyfriend  = new BoyFriend();
        Friend girlfriend = new GirlFriend();       // 객체 타입과 참조 변수 타입의 불일치

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}
