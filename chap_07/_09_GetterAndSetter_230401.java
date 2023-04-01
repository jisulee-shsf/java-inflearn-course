package chap_07;

public class _09_GetterAndSetter_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. Getter & Setter 사용
        p.setModelName("자바폰");
        // p.setModelType("프로맥스"); -> 인스턴스 변수 값 누락
        p.setModelCapacity(120); // -> 용량 정보 오기입
        p.setModelPrice(1000000);

        System.out.println("모델명: " + p.getModelName());
        System.out.println("모델 타입: " + p.getModelType());
        System.out.println("모델 용량: " + p.getModelCapacity());
        System.out.println("모델 가격: " + p.getModelPrice());
        /*
        모델명: 자바폰
        모델 타입: 오류가 발생했습니다.
        모델 용량: 128
        모델 가격: 1000000
        */
    }
}