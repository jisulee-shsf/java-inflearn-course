package chap_11;

public class _01_TryCatch_230425 {
    public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        오류 발생: / by zero
        프로그램 종료
        */

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] intArray = {1, 2, 3, 4, 5};
            intArray[5] = 10;
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        오류 발생: 5
        프로그램 종료
        */

        // 3. ClassCastException
        try {
            Object object = "Java";
            System.out.println((int) object);
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        오류 발생: java.lang.String cannot be cast to java.lang.Integer
        프로그램 종료
        */
    }
}