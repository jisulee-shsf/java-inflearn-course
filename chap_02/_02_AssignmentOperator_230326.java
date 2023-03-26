package chap_02;

public class _02_AssignmentOperator_230326 {
    public static void main(String[] args) {
        // 1. 대입 연산자
        int i = 30;
        System.out.println(i); // 30
        i = i + 10;
        System.out.println(i); // 40
        i = i - 10;
        System.out.println(i); // 30
        i = i * 10;
        System.out.println(i); // 300
        i = i / 10;
        System.out.println(i); // 30
        i = i % 10;
        System.out.println(i); // 0

        // 2. 복합 대입 연산자
        i = 30;
        i += 10; // -> i = i + 10
        System.out.println(i); // 40
        i -= 10; // -> i = i - 10
        System.out.println(i); // 30
        i *= 10; // -> i = i * 10
        System.out.println(i); // 300
        i /= 10; // -> i = i / 10
        System.out.println(i); // 30
        i %= 10; // -> i = i % 10
        System.out.println(i); // 0
    }
}
