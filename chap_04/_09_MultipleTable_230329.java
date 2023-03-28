package chap_04;

public class _09_MultipleTable_230329 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
        /*
        2 * 1 = 2
        2 * 2 = 4
        2 * 3 = 6
        ...
        9 * 7 = 63
        9 * 8 = 72
        9 * 9 = 81
        */
    }
}
