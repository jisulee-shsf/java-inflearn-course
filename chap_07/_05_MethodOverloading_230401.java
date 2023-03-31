package chap_07;

public class _05_MethodOverloading_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();
        p.modelName = "자바폰";
        System.out.println(p.modelName); // 자바폰

        // 2-1. 메서드 호출
        p.safety(true, true);
        /*
        안전 기능이 시작합니다.
        긴급 구조 요청 기능을 시작합니다.
        충돌 감지 기능을 시작합니다.
        */

        // 2-2. 메서드 오버로딩
        p.safety();
        /*
        안전 기능이 시작합니다.
        긴급 구조 요청 기능을 시작합니다.
        충돌 감지 기능을 시작합니다.
        */
    }
}
