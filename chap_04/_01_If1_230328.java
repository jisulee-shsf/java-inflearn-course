package chap_04;

public class _01_If1_230328 {
    public static void main(String[] args) {
        // 1-1. if문의 조건이 참인 경우 & {}를 생략한 경우
        int hour = 6;
        if (hour == 6)
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        System.out.println("PT를 종료합니다. #1-1");
        /*
        PT를 시작합니다.
        PT를 진행 중입니다.
        PT를 종료합니다. #1-1
        */

        // 1-2. if문의 조건이 참인 경우 & {}를 표기한 경우
        hour = 6;
        if (hour == 6) {
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        }
        System.out.println("PT를 종료합니다. #1-2");
        /*
        PT를 시작합니다.
        PT를 진행 중입니다.
        PT를 종료합니다. #1-2
        */

        // 2-1. if문의 조건이 거짓인 경우 & {}를 생략한 경우
        hour = 7;
        if (hour == 6)
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        System.out.println("PT를 종료합니다. #2-1");
        /*
        PT를 진행 중입니다.
        PT를 종료합니다. #2-1
        */

        // 2-2. if문의 조건이 거짓인 경우 & {}를 표기한 경우
        hour = 7;
        if (hour == 6) {
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        }
        System.out.println("PT를 종료합니다. #2-2");
        /*
        PT를 종료합니다. #2-2
        */
    }
}
