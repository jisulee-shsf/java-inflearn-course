package chap_06;

public class _02_Parameter_230330 {
    // 1. 매개변수(Parameter)가 1개인 경우
    public static void power(int number) {
        int result1 = number * number;
        System.out.println(number + "의 2승은 " + result1 + "입니다.");
    }

    // 2. 매개변수(Parameter)가 2개인 경우
    public static void powerByExp(int number, int exponent) {
        int result2 = 1;
        for (int i = 0; i < exponent; i++) {
            result2 *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result2 + "입니다.");
    }

    public static void main(String[] args) {
        power(2); // 2의 2승은 4입니다.
        power(4); // 4의 2승은 16입니다.

        powerByExp(2, 3); // 1 * 2, 2 * 2, 4 * 2 = 8 -> 2의 3승은 8입니다.
        powerByExp(3, 4); // 1 * 3, 3 * 3, 9 * 3, 27 * 3 = 81 -> 3의 4승은 81입니다.
    }
}
