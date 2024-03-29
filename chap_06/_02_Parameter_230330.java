package chap_06;

public class _02_Parameter_230330 {
    // 1. 메서드 정의
    public static void power(int number) {
        int result1 = number * number;
        System.out.println(number + "의 2승은 " + result1 + "입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result2 = 1;
        for (int i = 0; i < exponent; i++) {
            result2 *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result2 + "입니다.");
    }

    // 2. 메서드 호출
    public static void main(String[] args) {
        power(2);
        power(4);
        /*
        2의 2승은 4입니다.
        4의 2승은 16입니다.
        */

        powerByExp(2, 3);
        powerByExp(3, 4);
        /*
        2의 3승은 8입니다.
        3의 4승은 81입니다.
        */
    }
}