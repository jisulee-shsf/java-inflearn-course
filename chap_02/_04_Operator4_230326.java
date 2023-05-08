package chap_02;

public class _04_Operator4_230326 {
    public static void main(String[] args) {
        // 1. 논리 연산자
        boolean a = true;
        boolean b = true;
        boolean c = true;
        System.out.println(a && b && c); // true
        System.out.println(a || b || c); // true

        c = false;
        System.out.println(a && b && c); // false
        System.out.println(a || b || c); // true

        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false
        System.out.println((5 < 3) && (3 < 1)); // false

        System.out.println((5 > 3) || (3 > 1)); // true
        System.out.println((5 > 3) || (3 < 1)); // true
        System.out.println((5 < 3) || (3 < 1)); // false

        // 2. 논리 부정 연산자
        System.out.println(!a); // false
        System.out.println(!!a); // true
        System.out.println(!(3 == 3)); // false
        System.out.println(!(3 != 3)); // true
    }
}