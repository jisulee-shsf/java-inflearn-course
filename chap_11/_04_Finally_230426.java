package chap_11;

public class _04_Finally_230426 {
    public static void main(String[] args) {
        // 1. finally 블럭(정상 실행)
        try {
            System.out.println(100 / 2);
            System.out.println("계산 정상 실행");
        } catch (Exception e) {
            System.out.println("오류 확인: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
        /*
        50
        계산 정상 실행
        프로그램 종료
        */

        // 2. finally 블럭(오류 발생)
        try {
            System.out.println(100 / 0);
            throw new Exception("계산 오류 발생");
        } catch (Exception e) {
            System.out.println("오류 확인: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
        /*
        오류 확인: / by zero
        프로그램 종료
        */

        // 3. try-finally(catch 생략)
        try {
            System.out.println(100 / 0);
        } finally {
            System.out.println("프로그램 종료");
        }
        /*
        프로그램 종료
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at chap_11._04_Finally_230426.main(_04_Finally_230426.java:37)
        */
    }
}