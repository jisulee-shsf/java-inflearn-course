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

        // 2. * 좌우 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                // for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("#2-1");
        /*
        *
        **
        ***
        ****
        *****
        #2-1
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
                /*
                1) i = 0,  j = 0
                   0 < (4 - 0) -> s
                   1 < (4 - 0) -> s
                   2 < (4 - 0) -> s
                   3 < (4 - 0) -> s
                   4 < (4 - 0) -> X
                2) i = 1,  j = 0
                   0 < (4 - 1) -> s
                   1 < (4 - 1) -> s
                   2 < (4 - 1) -> s
                   3 < (4 - 1) -> X
                3) i = 2,  j = 0
                   0 < (4 - 2) -> s
                   1 < (4 - 3) -> s
                   2 < (4 - 4) -> X
                3) i = 3,  j = 0
                   0 < (4 - 3) -> s
                   1 < (4 - 3) -> X
                4) i = 4,  j = 0
                   0 < (4 - 4) -> X
                */
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("#2-2");
        /*
            *
           **
          ***
         ****
        *****
        #2-2
        */
    }
}
