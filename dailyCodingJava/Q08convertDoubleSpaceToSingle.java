package dailyCodingJava;

public class Q08convertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String output =  convertDoubleSpaceToSingle("Example  test String  Main");
        System.out.println(output);
    }

    public static String convertDoubleSpaceToSingle(String str) {

        // 두 칸 공백을 나눔
        String[] words = str.split("  ");

        for (String word: words)
            System.out.println(word);

        // 한 칸 공백으로 바꿈
        return String.join(" ", words);


//        String[] strArr = str.split(" ");
//        for(String word : strArr) {
//            System.out.println(word);
//        }
//        System.out.println("---------");
//
//        for(int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i].toString());
//            if (strArr[i].equals(" ")) {
//                strArr[i] = "";
//            }
//        }
//        return String.join(" ", strArr);
//
//        String result = "";
//        char before = 0;
//
//        for(int i = 0; i < str.length(); i++) {
//            if(' ' != before || str.charAt(i) != ' ') {
//                result = result + str.charAt(i);
//            }
//            before = str.charAt(i);
//        }
//        return result;
    }
}
