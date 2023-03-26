package chap_02;

public class _05_ternaryOperator_230326 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 3;
        int y = 1;
        int num = (x > y) ? x : y;
        System.out.println(num); // x -> 3
        num = (x < y) ? x : y;
        System.out.println(num); // y -> 1

        boolean b = (x > y) ? true : false;
        System.out.println(b); // true
        b = (x < y) ? true : false;
        System.out.println(b); // false

        String s = (x == y) ? "같은 숫자입니다." : "다른 숫자입니다.";
        System.out.println(s); // 다른 숫자입니다.
        s = (x != y) ? "다른 숫자입니다." : "같은 숫자입니다.";
        System.out.println(s); // 다른 숫자입니다.
    }
}
