package chap_04;

public class _08_NestedLoop_230329 {
    public static void main(String[] args) {
        // 1. * 사각형 만들기
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.println();
        }
        System.out.println("#1-1");
        /*
        *****
        *****
        *****
        *****
        *****
        #1-1
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("#1-2");
        /*
        *****
        *****
        *****
        *****
        *****
        #1-2
        */

        // 2-1. 좌측 * 삼각형 만들기
        for (int j = 0; j <= 0; j++) System.out.print("*"); System.out.println();
        for (int j = 0; j <= 1; j++) System.out.print("*"); System.out.println();
        for (int j = 0; j <= 2; j++) System.out.print("*"); System.out.println();
        for (int j = 0; j <= 3; j++) System.out.print("*"); System.out.println();
        for (int j = 0; j <= 4; j++) System.out.print("*"); System.out.println();
        /*
         *
         **
         ***
         ****
         *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
            // for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("#2-1");
        /*
        *     -> i: 0 / j: 0
        **    -> i: 1 / j: 0, 1
        ***   -> i: 2 / j: 0, 1, 2
        ****  -> i: 3 / j: 0, 1, 2, 3
        ***** -> i: 4 / j: 0, 1, 2, 3, 4
        #2-1
        */

        // 2-2. 우측 * 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("s");
            }
            for (int k = 0; k <= i; k++) {
            // for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("#2-2");
        /*
        ssss* -> i: 0 / j: 0, 1, 2, 3 / k: 0
        sss** -> i: 1 / j: 0, 1, 2 / k: 0, 1
        ss*** -> i: 2 / j: 0, 1 / k: 0, 1, 2
        s**** -> i: 3 / j: 0 / k: 0, 1, 2, 3
        ***** -> i: 4 / k: 0, 1, 2, 3, 4
        #2-2
        */
    }
}