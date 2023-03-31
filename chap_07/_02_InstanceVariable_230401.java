package chap_07;

public class _02_InstanceVariable_230401 {
    public static void main(String[] args) {
        // 인스턴스 변수 사용
        Phone p1 = new Phone(); // 클래스 객체 생성
        p1.modelName = "자바폰1"; // 인스턴스 변수 값 설정
        p1.modelType = "프로";
        p1.modelCapacity = 128;
        p1.modelPrice = 1000000;

        Phone p2 = new Phone();
        p2.modelName = "자바폰2";
        p2.modelType = "프로 맥스";
        p2.modelCapacity = 256;
        p2.modelPrice = 1500000;
    }
}
