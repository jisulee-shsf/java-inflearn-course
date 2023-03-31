package chap_04;

public class _03_Else_230328 {
    public static void main(String[] args) {
        // 1. if문의 조건식이 참인 경우
        int hour = 6;
        if (hour == 6) {
            System.out.println("PT를 시작합니다."); // 6시에 도착하면, PT 시작
        } else {
            System.out.println("PT 진행이 어렵습니다."); // 그 외, PT 진행 불가
        }
        System.out.println("PT를 종료합니다. #1");
        /*
        PT를 시작합니다.
        PT를 종료합니다. #1
        */

        // 2. if문의 조건식이 거짓인 경우 -> else블럭 수행
        hour = 7;
        boolean breakfast = false;
        if (hour == 6 && breakfast == false) {
            System.out.println("PT를 시작합니다."); // 6시에 도착하고 공복이라면, PT 시작
        } else {
            System.out.println("PT 진행이 어렵습니다."); // 그 외, PT 진행 불가
        }
        System.out.println("PT를 종료합니다. #2");
        /*
        PT 진행이 어렵습니다.
        PT를 종료합니다. #2
        */
    }
}
