package chap_04;

public class _02_If2_230328 {
    public static void main(String[] args) {
        // 1. if문의 조건을 모두 만족한 경우
        int hour = 6;
        boolean breakfast = false;
        if (hour == 6 && breakfast == false) { // 6시에 도착하고 공복이라면, PT 시작
        // if (hour <= 6 && !breakfast) {
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        }
        System.out.println("PT를 종료합니다. #1");
        /*
        PT를 시작합니다.
        PT를 진행 중입니다.
        PT를 종료합니다. #1
        */

        // 2. if문의 조건 중, 하나라도 만족한 경우
        hour = 6;
        breakfast = true;
        if (hour == 6 || breakfast == true) { // 6시에 도착하거나 또는 공복이라면, PT 시작
        // f (hour <= 6 || breakfast) {
            System.out.println("PT를 시작합니다.");
            System.out.println("PT를 진행 중입니다.");
        }
        System.out.println("PT를 종료합니다. #2");
        /*
        PT를 시작합니다.
        PT를 진행 중입니다.
        PT를 종료합니다. #2
        */
    }
}