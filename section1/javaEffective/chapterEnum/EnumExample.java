package section1.javaEffective.chapterEnum;

enum Seasons {SPRING, SUMMER, FALL, WINTER}

public class EnumExample {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SPRING;
        switch (seasons) {
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
    }
}
