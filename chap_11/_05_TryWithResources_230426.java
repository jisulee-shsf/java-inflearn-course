package chap_11;

public class _05_TryWithResources_230426 {
    public static void main(String[] args) {
        // 1. sdf
        fileWriter fw1 = null;
        try {
            fw1 = new fileWriter();
            fw1.write("첫 번째 내용을 입력합니다.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        /*
        파일 내용을 입력합니다.
        입력 내용: 첫 번째 내용을 입력합니다.
        파일을 닫습니다.
        */

        try (fileWriter fw2 = new fileWriter()) {
            fw2.write("두 번째 내용을 입력합니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        파일 내용을 입력합니다.
        입력 내용: 두 번째 내용을 입력합니다.
        파일을 닫습니다.
        */
    }
}

class fileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 닫습니다.");
    }

    public void write(String input) {
        System.out.println("파일 내용을 입력합니다.");
        System.out.println("입력 내용: " + input);
    }
}