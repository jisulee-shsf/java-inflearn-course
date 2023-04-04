package chap_07;

public class _05_MethodOverloading_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 인스턴스 변수 값 설정
        p.modelName = "자바폰";
        System.out.println(p.modelName); // 자바폰

        // 3. 메서드 호출(오버로딩)
        p.safety(true, true);
        /*
        안전 기능이 시작합니다.
        긴급 구조 요청 기능을 시작합니다.
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

/*
// 오버로딩
public class Phone {
    // 1. safety() 메서드1
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

    // 2. safety() 메서드2
    void safety() {
        safety(true, true); // 기본값 설정
    }
}
*/
