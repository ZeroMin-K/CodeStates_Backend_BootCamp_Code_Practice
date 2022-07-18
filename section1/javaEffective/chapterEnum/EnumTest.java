package section1.javaEffective.chapterEnum;

enum Level2 {
    LOW,    // 0
    MEDIUM,     // 1
    HIGH        // 2
}

public class EnumTest {
    public static void main(String[] args) {
        Level2 level = Level2.MEDIUM;

        Level2[] allLevels = Level2.values();
        for(Level2 x : allLevels) {
            System.out.printf("%s=%d%n", x.name(), x.ordinal());
        }

        Level2 findLevel = Level2.valueOf("LOW");
        System.out.println(findLevel);
        System.out.println(Level2.LOW == Level2.valueOf("LOW"));

        switch (level) {
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;
        }
    }
}
