package chap_02;

public class _05_Operator5_230326 {
    public static void main(String[] args) {
        // 삼항 연산자
        int x = 1;
        int y = 3;
        int min = (x < y) ? x : y;
        System.out.println(min); // x -> 1
        int max = (x > y) ? x : y;
        System.out.println(max); // y -> 3

        boolean b = (x > y) ? true : false;
        System.out.println(b); // false
        b = (x < y) ? true : false;
        System.out.println(b); // true

        String s = (x == y) ? "같은 숫자입니다." : "다른 숫자입니다.";
        System.out.println(s); // 다른 숫자입니다.
        s = (x != y) ? "다른 숫자입니다." : "같은 숫자입니다.";
        System.out.println(s); // 다른 숫자입니다.
    }
}