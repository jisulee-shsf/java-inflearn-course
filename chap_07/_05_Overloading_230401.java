package chap_07;

public class _05_Overloading_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 인스턴스 변수 값 설정
        p.modelName = "자바폰";

        // 3-1. 오버로딩) 메서드1 호출
        p.safety(true, true);
        /*
        안전 기능이 시작합니다.
        긴급 구조 요청 기능을 시작합니다.
        충돌 감지 기능을 시작합니다.
        */

        // 3-2. 오버로딩) 메서드2 호출
        p.safety();
        /*
        안전 기능이 시작합니다.
        긴급 구조 요청 기능을 시작합니다.
        충돌 감지 기능을 시작합니다.
        */
    }
}

/*
// 오버로딩
public class Phone {
    // 1. 메서드1
    void safety(boolean useEmergencySos, boolean useCrashDetection) {
        System.out.println("안전 기능을 시작합니다.");
        if (useEmergencySos) {
            System.out.println("긴급 구조 요청 기능을 시작합니다");
        }
        if (useCrashDetection) {
            System.out.println("충돌 감지 기능을 시작합니다.");
        }
        System.out.println();
    }

    // 2. 메서드2
    void safety() {
        safety(true, true); // 기본값 설정
    }
}
*/
