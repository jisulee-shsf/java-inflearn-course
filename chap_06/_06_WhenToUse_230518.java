package chap_06;

public class _06_WhenToUse_230518 {
    // 1. 메서드 정의
    public static int getPower(int number) {
        // return number * number;
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result2 = 1;
        for (int i = 0; i < exponent; i++) {
            result2 *= number;
        }
        return result2;
    }

    // 2. 메서드 호출
    public static void main(String[] args) {
        int power1 = getPower(2);
        System.out.println(power1); // 4

        int power2 = getPower(2, 3);
        System.out.println(power2); // 8
    }
}