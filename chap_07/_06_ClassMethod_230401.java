package chap_07;

public class _06_ClassMethod_230401 {
    public static void main(String[] args) {
        // 1. 객체 생성 전) 클래스 메서드 호출
        Phone.useSafetyFeatures(); // 안전 기능을 시작합니다.
        
        // 2. 클래스 객체 생성
        Phone p = new Phone();

        // 3. 객체 생성 후) 클래스 메서드 호출
        p.useSafetyFeatures(); // 안전 기능을 시작합니다.
    }
}

/*
// 클래스 메서드
public class Phone {
    // 클래스 메서드 정의
    static void useSafetyFeatures() {
        System.out.println("안전 기능을 시작합니다.");
        // modelName = "자바자바폰"; // 클래스 메서드 내에 인스턴스 변수 사용 불가
        // canCrashDetection = false; // 클래스 메서드 내에 클래스 변수 사용 가능
    }
}
*/
