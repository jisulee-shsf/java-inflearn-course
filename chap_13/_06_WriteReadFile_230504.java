package chap_13;

import java.io.*;

public class _06_WriteReadFile_230504 {
    public static void main(String[] args) throws IOException {
        // FileWriter fileWriter = new FileWriter("text.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
//            bufferedWriter.write("1. 첫 번째 입력입니다.");
//            bufferedWriter.newLine();
            bufferedWriter.write("2. 두 번째 입력입니다.");
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
        1. 첫 번째 입력입니다.
        2. 두 번째 입력입니다.
        */
    }
}