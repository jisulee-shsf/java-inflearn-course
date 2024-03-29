package chap_07;

public class _04_Method_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone4 p = new Phone4();

        // 2. 메서드 호출
        p.canCrashDetection1();
        p.canCrashDetection2(1);
        int objectCount = p.canCrashDetection3(1);
        System.out.println("충돌이 감지된 물체 개수: " + objectCount + "개");
        /*
        충돌이 감지되었습니다.
        충돌이 감지되었습니다.
        충돌이 감지된 물체 개수: 10개
        */
    }
}

class Phone4 {
    // 1. 기본 메서드 정의
    void canCrashDetection1() {
        System.out.println("충돌이 감지되었습니다.");
    }

    // 2. 매개 변수가 있는 메서드 정의
    void canCrashDetection2(int number) {
        if (number == 1) {
            System.out.println("충돌이 감지되었습니다.");
        } else {
            System.out.println("충돌이 감지되지 않았습니다.");
        }
    }

    // 3. 매개 변수와 반환값이 있는 메서드 정의
    int canCrashDetection3(int number) {
        if (number == 1) { // 충돌이 감지된 경우
            return 10; // 충돌 감지 물체 개수
        } else {
            return 0; // 충돌 감지 물체 없음
        }
    }
}