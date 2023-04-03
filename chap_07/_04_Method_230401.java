package chap_07;

public class
_04_Method_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 인스턴스 변수 값 설정
        p.modelName = "자바폰";
        System.out.println(p.modelName); // 자바폰

        // 3. 메서드 호출
        p.canCrashDetection1(); // 충돌이 감지되었습니다.
        p.canCrashDetection2(1); // 충돌이 감지되었습니다.
        int objectCount = p.crashDetection3(1);
        System.out.println(p.modelName + "에 충돌이 감지된 물체 개수: " + objectCount + "개"); // 자바폰에 충돌이 감지된 물체 개수: 10개
    }
}

/*
// 메서드 정의
public class Phone {
    // 1. 기본 메서드 정의
    void canCrashDetection1() {
        System.out.println("충돌이 감지되었습니다.");
    }

    // 2. 매개변수가 있는 메서드 정의
    void canCrashDetection2(int number) {
        if (number == 1) {
            System.out.println("충돌이 감지되었습니다.");
        } else {
            System.out.println("충돌이 감지되지 않았습니다.");
        }
    }

    // 3. 매개변수와 반환값이 있는 메서드 정의
    int crashDetection3(int number) {
        if (number == 1) { // 충돌이 감지된 경우
            return 10; // 충돌 감지 물체 개수
        } else { // 이외의 경우
            return 0; // 충돌 감지 물체 없음
        }
    }
}
*/