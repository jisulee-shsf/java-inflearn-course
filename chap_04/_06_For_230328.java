package chap_04;

public class _06_For_230328 {
    public static void main(String[] args) {
        // 1. for문
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " "); // 0 1 2 3 4 5 6 7 8 9

        }

        // 2-1. 짝수 & 홀수 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " "); // 0 2 4 6 8
        }

        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " "); // 1 3 5 7 9
        }

        // 2-2. 숫자 거꾸로 출력
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " "); // 10 9 8 7 6 5 4 3 2 1
        }

        // 2-3. 숫자 총합 출력
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println(i + ":\t" + sum);
            /*
            1:	1
            2:	3
            3:	6
            4:	10
            5:	15
            6:	21
            7:	28
            8:	36
            9:	45
            10:	55
            */
        }
        System.out.println(sum); // 55
    }
}