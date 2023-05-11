package chap_04;

public class _03_Else_230328 {
    public static void main(String[] args) {
        // if-else문
        int hour = 6;
        if (hour <= 6) {
            System.out.println("PT를 시작합니다."); // 6시까지 도착하면, PT 시작
        } else {
            System.out.println("PT 진행이 어렵습니다."); // 그 외, PT 진행 불가
        }
        System.out.println("PT를 종료합니다. #1");
        /*
        PT를 시작합니다.
        PT를 종료합니다. #1
        */

        hour = 10;
        boolean breakfast = false;
        if (hour <= 6 && !breakfast) {
            System.out.println("PT를 시작합니다."); // 6시까지 도착하고 공복이라면, PT 시작
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