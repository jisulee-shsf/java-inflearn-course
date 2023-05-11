package chap_04;

public class _02_If2_230328 {
    public static void main(String[] args) {
        // 1. &&: if문 조건을 모두 만족한 경우
        int hour = 5;
        boolean breakfast = false;
        if (hour <= 6 && breakfast == false) { // 6시까지 도착하고 공복이라면, PT 시작
            // if (hour <= 6 && !breakfast) {
            System.out.println("PT 첫 번째 타임을 시작합니다.");
            System.out.println("PT 진행 중입니다.");
        }
        System.out.println("PT를 종료합니다. #1");
        /*
        PT 첫 번째 타임을 시작합니다.
        PT 진행 중입니다.
        PT를 종료합니다. #1
        */

        // 2. ||: if문 조건 중, 하나라도 만족한 경우
        hour = 6;
        breakfast = true;
        if (hour <= 7 || breakfast == false) { // 7시까지 도착하거나 공복이라면, PT 시작
            if (hour <= 7 || breakfast) {
                System.out.println("PT 두 번째 타임을 시작합니다.");
                System.out.println("PT 진행 중입니다.");
            }
            System.out.println("PT를 종료합니다. #2");
        /*
        PT 두 번째 타임을 시작합니다.
        PT 진행 중입니다.
        PT를 종료합니다. #2
        */
        }
    }
}