package chap_13;

import java.io.File;

public class _04_Folder_230503 {
    public static void main(String[] args) {
        File folder1 = new File("AAA");
        folder1.mkdir();
        if (folder1.exists()) {
            System.out.println("폴더 이름: " + folder1.getName());
            System.out.println("폴더 경로: " + folder1.getAbsoluteFile());
        } else {
            System.out.println("폴더 없음");
        }
        /*
        폴더 이름: AAA
        폴더 경로: /Users/jisulee/workspace/java/AAA
        */

        File folder2 = new File("AAA/BBB/CCC");
        folder2.mkdirs();
        if (folder2.exists()) {
            System.out.println("폴더 이름: " + folder2.getName());
            System.out.println("폴더 경로: " + folder2.getAbsoluteFile());
        } else {
            System.out.println("폴더 없음");
        }
        /*
        폴더 이름: CCC
        폴더 경로: /Users/jisulee/workspace/java/AAA/BBB/CCC
        */
    }
}
