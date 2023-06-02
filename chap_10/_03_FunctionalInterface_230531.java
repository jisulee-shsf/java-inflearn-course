package chap_10;

import chap_10.checker.Checkable;
import chap_10.checker.NumberCheck;

public class _03_FunctionalInterface_230531 {
    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        numberCheck.check(10); // NumberCheck: 100

        check(numberCheck, 10); // NumberCheck: 100
        check((number) -> System.out.println("NumberCheck: " + number * 10), 10); // NumberCheck0: 100

        Checkable checkable = (number) -> System.out.println("NumberCheck: " + number * 10);
        check(checkable, 10); // NumberCheck: 100
    }

    public static void check(Checkable c, int number) {
        c.check(number);
    }
}