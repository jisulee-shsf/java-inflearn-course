package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws_230427 {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("오류 확인: " + e.getMessage());
            System.out.println("main 메소드에서 오류 해결 후, 프로그램을 실행합니다.");
        }
    }

    public static void writeFile() throws IOException {
        FileWriter writer = new FileWriter("file.txt");
        throw new IOException("오류가 발생했습니다.");
    }
    /*
    오류 확인: 오류가 발생했습니다.
    main 메소드에서 오류 해결 후, 프로그램을 실행합니다.
    */

    /*
    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter("file.txt");
            throw new IOException("오류가 발생했습니다.");
        } catch (IOException e) {
            System.out.println("오류 확인: " + e.getMessage());
            System.out.println("writeFile 메소드에서 오류 해결 후, 프로그램을 실행합니다.");
        }
     }
     오류 확인: 오류가 발생했습니다.
     writeFile 메소드에서 오류 해결 후, 프로그램을 실행합니다.
     */
}