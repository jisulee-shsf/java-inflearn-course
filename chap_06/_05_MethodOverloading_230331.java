package chap_06;

public class _05_MethodOverloading_230331 {

    // 1-1. 기본 메소드
    public static int getPower(int number) {
        int result1 = number * number;
        return result1;
    }

    // 1-2. 매개변수의 타입(int -> String)이 다른 경우
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        int result2 = number * number;
        return result2;
    }

    // 1-3. 매개변수의 개수(1 -> 2)가 다른 경우
    public static int getPower(int number, int exponent) {
        int result3 = 1;
        for (int i = 0; i < exponent; i++) {
            result3 *= number;
        }
        return result3;
    }

    public static void main(String[] args) {
        // 2. method overloading 출력
        int power1 = getPower(2); // 매개변수 타입이 다른 경우
        System.out.println(power1); // 4

        int power2 = getPower("2"); // 매개변수 타입이 다른 경우
        System.out.println(power2); // 4

        int power3 = getPower(2, 3); // 매개변수의 개수가 다른 경우
        System.out.println(power3); // 8
    }
}
