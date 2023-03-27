package chap_04;

public class _06_For_230328 {
    public static void main(String[] args) {
        // 1. for문
        for (int i = 0; i < 10; i++) {
            System.out.print(i); // 0123456789
        }

        System.out.println();

        // 2-1. 짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i); // 02468
        }

        System.out.println();

        // 2-2. 홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i); //13579
        }

        System.out.println();

        // 2-3. 숫자 거꾸로 출력
        for (int i = 10; i > 0; i--) {
            System.out.print(i); //10987654321
        }

        System.out.println();

        // 2-4. 1부터 10까지 총합 출력
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            System.out.print(i); // 12345678910
            sum += i;
        }
        System.out.println();
        System.out.print(sum); // 55
    }
}