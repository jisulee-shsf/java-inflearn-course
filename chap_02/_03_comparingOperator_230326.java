package chap_02;

public class _03_comparingOperator_230326 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(3 > 1); // true
        System.out.println(3 > 5); // false

        System.out.println(3 >= 1); // true
        System.out.println(3 >= 3); // true
        System.out.println(3 >= 5); // false

        System.out.println(3 < 1); // false
        System.out.println(3 < 5); // true

        System.out.println(3 <= 1); // false
        System.out.println(3 <= 3); // true
        System.out.println(3 <= 5); // true

        System.out.println(3 == 1); // false
        System.out.println(3 == 3); // true

        System.out.println(3 != 1); // true
        System.out.println(3 != 3); // false
    }
}
