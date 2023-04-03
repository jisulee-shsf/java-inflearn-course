package chap_07;

public class _06_ClassMethod_230401 {
    public static void main(String[] args) {
        // 1-1. 클래스 객체 생성
        Phone p = new Phone();

        // 1-2. 클래스 메서드 호출(객체 생성 후 클래스 메서드 호출)
        p.useSafetyFeatures(); // 안전 기능을 시작합니다.

        // 2. 클래스 메서드 호출(객체 생성없이 클래스 메서드 호출)
        Phone.useSafetyFeatures(); // 안전 기능을 시작합니다.

    }
}

/*
// 클래스 메서드 정의
public class Phone {
    static void useSafetyFeatures() {
        System.out.println("안전 기능을 시작합니다.");
        // modelName = "자바자바폰"; // 클래스 메서드 내에 인스턴스 변수 사용 불가
        // canCrashDetection = false; // 클래스 메서드 내에 클래스 변수 사용 가능
    }
}
*/