package chap_06;

public class _05_MethodOverloading_230331 {
    // 1. 메서드 정의
    public static int getPower(int number) {
        int result1 = number * number;
        return result1;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        int result2 = number * number;
        return result2;
    }

    public static int getPower(int number, int exponent) {
        int result3 = 1;
        for (int i = 0; i < exponent; i++) {
            result3 *= number;
        }
        return result3;
    }

    // 2. 메서드 호출
    public static void main(String[] args) {
        int power1 = getPower(2); // 기본 메서드
        System.out.println(power1); // 4

        int power2 = getPower("2"); // 매개변수 타입이 다른 경우
        System.out.println(power2); // 4

        int power3 = getPower(2, 3); // 매개변수 개수가 다른 경우
        System.out.println(power3); // 8
    }
}