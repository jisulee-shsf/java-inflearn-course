package chap_04;

public class _01_If1_230328 {
    public static void main(String[] args) {
        // 1. if문 내에 수행 문장이 1개인 경우 & 괄호를 생략한 경우
        int hour = 6;
        if (hour <= 6)
            System.out.println("PT를 시작합니다.");
        System.out.println("PT를 종료합니다. #1");
        /*
        PT를 시작합니다.
        PT를 종료합니다. #1
        */

        // 2. if문 내에 수행 문장이 2개인 경우 & 괄호를 생략한 경우
        hour = 10;
        if (hour <= 6)
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        System.out.println("PT를 종료합니다. #2");
        /*
        PT를 진행 중입니다.
        PT를 종료합니다. #2
        */

        // 3. if문 내에 수행 문장이 2개인 경우 & 괄호를 표기한 경우
        hour = 6;
        if (hour <= 6) {
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        }
        System.out.println("PT를 종료합니다. #3");
        /*
        PT를 시작합니다.
        PT를 진행 중입니다.
        PT를 종료합니다. #3
        */
    }
}