package chap_07;

public class _05_Overloading_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone5 p = new Phone5();

        // 2. 메서드 호출
        p.safety(true, true);
        /*
        안전 기능을 시작합니다.
        긴급 구조 요청 기능을 시작합니다
        충돌 감지 기능을 시작합니다.
        */

        p.safety();
        /*
        안전 기능이 시작합니다.
        긴급 구조 요청 기능을 시작합니다.
        충돌 감지 기능을 시작합니다.
        */
    }
}

class Phone5 {
    // 메서드 오버로딩
    void safety(boolean useEmergencySOS, boolean useCrashDetection) {
        System.out.println("안전 기능을 시작합니다.");
        if (useEmergencySOS) {
            System.out.println("긴급 구조 요청 기능을 시작합니다");
        }
        if (useCrashDetection) {
            System.out.println("충돌 감지 기능을 시작합니다.");
        }
        System.out.println();
    }

    void safety() {
        safety(true, true);
    }
}