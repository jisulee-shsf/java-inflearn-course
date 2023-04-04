package chap_07;

public class _02_InstanceVariable_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p1 = new Phone();
        Phone p2 = new Phone();

        // 2. 인스턴스 변수 값 설정
        p1.modelName = "자바폰1";
        p1.modelType = "프로";
        p1.modelCapacity = 128;
        p1.modelPrice = 1000000;

        p2.modelName = "자바폰2";
        p2.modelType = "프로맥스";
        p2.modelCapacity = 256;
        p2.modelPrice = 1500000;
    }
}

/*
// 인스턴스 변수
public class Phone {
    // 인스턴스 변수 선언
    String modelName; // 모델명
    String modelType; // 모델 타입
    int modelCapacity; // 모델 용량
    int modelPrice; // 모델 가격
}
*/
