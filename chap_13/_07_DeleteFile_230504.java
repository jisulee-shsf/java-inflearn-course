package chap_13;

import java.io.File;

public class _07_DeleteFile_230504 {
    public static void main(String[] args) {
        // 1. 파일 삭제
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println(file.getName() + " 파일 삭제를 성공했습니다.");
        } else {
            System.out.println(file.getName() + " 파일 삭제를 실패했습니다.");
        }
        /*
        test.txt 파일 삭제를 실패했습니다.
        */

        // 2. 폴더 삭제
        File folder = new File("AAA");
        if (deleteFolder(folder)) {
            System.out.println("폴더 삭제를 완료했습니다.");
        } else {
            System.out.println("삭제할 폴더가 없습니다.");
        }
        /*
        폴더 삭제: /Users/jisulee/workspace/java/AAA/BBB/CCC
        폴더 삭제: /Users/jisulee/workspace/java/AAA/BBB
        폴더 삭제: /Users/jisulee/workspace/java/AAA
        폴더 삭제를 완료했습니다.
        */
    }

    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFolder(file);
            }
        }
        System.out.println("폴더 삭제: " + folder.getAbsolutePath());
        return folder.delete();
    }
}