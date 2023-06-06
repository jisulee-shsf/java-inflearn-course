package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_File_230503 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            file.createNewFile();
            if (file.exists()) {
                System.out.println("파일 이름: " + file.getName());
                System.out.println("파일 경로: " + file.getAbsoluteFile());
                System.out.println("파일 크기: " + file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
        파일 이름: text.txt
        파일 경로: /Users/jisulee/workspace/java/text.txt
        파일 크기: 5 -> 12345
        */
    }
}