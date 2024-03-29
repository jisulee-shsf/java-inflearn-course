package chap_06;

public class _04_ParameterAndReturn_230330 {
    // 1. 메서드 정의
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    
    // 2. 메서드 호출
    public static void main(String[] args) {
        int resultValue1 = getPower(2);
        System.out.println(resultValue1); // 4
        System.out.println(getPower(2)); // 4

        int resultValue2 = getPowerByExp(2, 3);
        System.out.println(resultValue2); // 8
        System.out.println(getPowerByExp(2, 3)); // 8
    }
}