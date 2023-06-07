package chap_13;

import java.io.File;

public class  _05_FileAndFolder_230504 {
    public static void main(String[] args) {
        File option1 = new File(".");
        System.out.println(option1.getAbsolutePath());
        for (File file : option1.listFiles()) {
            if (file.isFile()) {
                System.out.println("파일: " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("폴더: " + file.getName());
            }
            /*
            /Users/jisulee/workspace/java/.
            파일: .DS_Store
            파일: java.iml
            폴더: out
            폴더: AAA
            파일: README.md
            파일: text.txt
            폴더: .git
            폴더: .idea
            폴더: src
            */
        }

        File option2 = new File("src/chap_13");
        // File option2 = new File("/Users/jisulee/workspace/java/src/chap_13");
        System.out.println(option2.getAbsolutePath());
        for (File file : option2.listFiles()) {
            if (file.isFile()) {
                System.out.println("파일: " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("폴더: " + file.getName());
            }
            /*
            /Users/jisulee/workspace/java/src/chap_13
            파일: _01_Input_230430.java
            파일: _02_Output_230503.java
            파일: _03_File_230503.java
            파일: _04_Folder_230503.java
            파일: _05_FolderAndFile_230504.java
            */
        }
    }
}