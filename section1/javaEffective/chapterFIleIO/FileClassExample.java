package section1.javaEffective.chapterFIleIO;

import java.io.File;

public class FileClassExample {
    public static void main(String[] args) {
        File parentDir = new File("./");
        File[] list = parentDir.listFiles();

        String prefix = "code";

        for(int i =0 ; i < list.length; i++) {
            String fileName = list[i].getName();

            if(fileName.endsWith("txt") && !fileName.startsWith("code")) {
                list[i].renameTo(new File(parentDir, prefix + fileName));
            }
        }
    }
}
