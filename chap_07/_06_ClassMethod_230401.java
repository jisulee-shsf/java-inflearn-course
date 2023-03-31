package chap_07;

public class _06_ClassMethod_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p1 = new Phone();
        p1.modelName = "자바폰1";

        Phone p2 = new Phone();
        p2.modelName = "자바폰2";

        // 2. 클래스 메서드 호출
        p1.useSafetyFeatures(); // 객체 생성 후 클래스 메서드 호출 -> 안전 기능을 시작합니다.
        p2.useSafetyFeatures(); // 객체 생성 후 클래스 메서드 호출 -> 안전 기능을 시작합니다.
        Phone.useSafetyFeatures(); // 객체 생성없이 클래스 메서드 호출 -> 안전 기능을 시작합니다.
    }
}