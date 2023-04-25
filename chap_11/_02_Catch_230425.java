package chap_11;

public class _02_Catch_230425 {
    public static void main(String[] args) {
        // 1. ArithmeticException
        try {
            System.out.println(100 / 0);
        } catch (ArithmeticException e) {
            System.out.println("계산 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        계산 오류 발생
        프로그램 종료
        */

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] intArray = {1, 2, 3, 4, 5};
            intArray[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("계산 오류 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        인덱스 오류 발생
        프로그램 종료
        */

        // 3. ClassCastException
        try {
            Object object = "Java";
            System.out.println((int) object);
        } catch (ArithmeticException e) {
            System.out.println("계산 오류 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 오류 발생");
        } catch (ClassCastException e) {
            System.out.println("형변환 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        형변환 오류 발생
        프로그램 종료
        */

        // 4. NullPointerException
        try {
            String s = null;
            System.out.println(s.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("계산 오류 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 오류 발생");
        } catch (ClassCastException e) {
            System.out.println("형변환 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        오류 발생: null
        프로그램 종료
        */

        // 5. 멀티 catch 블럭
        try {
            int[] intArray = {1, 2, 3, 4, 5};
            intArray[5] = 10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("계산 또는 인덱스 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
        /*
        계산 또는 인덱스 오류 발생
        프로그램 종료
        */
    }
}