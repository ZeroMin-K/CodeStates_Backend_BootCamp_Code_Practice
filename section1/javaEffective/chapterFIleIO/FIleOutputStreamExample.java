package section1.javaEffective.chapterFIleIO;

import java.io.FileOutputStream;

public class FIleOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("codestates.txt");
            String word = "code";

            byte b[] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
