package chap_02;

public class _01_Operator1_230326 {
    public static void main(String[] args) {
        // 1. 일반 연산
        System.out.println(3 + 3); // 6
        System.out.println(3 - 3); // 0
        System.out.println(3 * 3); // 9
        System.out.println(3 / 3); // 1
        System.out.println(3 / 2); // 1.5(X) -> 1
        System.out.println(3 % 3); // 0
        System.out.println(3 % 2); // 1

        // 2. 우선순위 연산
        System.out.println(3 + 3 * 3); // 12
        System.out.println((3 + 3) * 3); // 18

        // 3. 변수 연산
        int a = 30;
        int b = 10;
        int c = a + b;
        System.out.println(c); // 40
        c = a - b;
        System.out.println(c); // 20

        // 4-1. 증감 연산
        int i = 30;
        System.out.println(i); // 30
        System.out.println(i++); // 30
        System.out.println(i); // 31

        i = 30;
        System.out.println(i); // 30
        System.out.println(++i); // 31
        System.out.println(i); // 31

        // 4-2. 감소 연산
        i = 30;
        System.out.println(i); // 30
        System.out.println(i--); // 30
        System.out.println(i); // 29

        i = 30;
        System.out.println(i); // 30
        System.out.println(--i); // 29
        System.out.println(i); // 29

        // 4-3. 증감 연산 예시
        int waiting = 0;
        System.out.println("현재 대기 인원은 " + waiting++ + "명입니다."); // 0
        System.out.println("현재 대기 인원은 " + waiting++ + "명입니다."); // 1
        System.out.println("현재 대기 인원은 " + waiting++ + "명입니다."); // 2
        System.out.println("현재 총 대기 인원은 " + waiting + "명입니다."); // 3

        /*
        현재 대기 인원은 0명입니다.
        현재 대기 인원은 1명입니다.
        현재 대기 인원은 2명입니다.
        현재 총 대기 인원은 3명입니다.
        */
    }
}