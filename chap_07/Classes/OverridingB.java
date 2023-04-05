package chap_07.Classes;

public class OverridingB extends OverridingA {

    // 2-1. 생성자 정의
    public OverridingB() {
        // 인스턴스 변수 초기화
        this.modelName = "자바폰2";
    }

    // 2-2. 오버라이딩) 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": OverridingB에서 feature1의 오버라이딩입니다.");
    }

    public void feature2() {
        System.out.println(this.modelName + ": feature2입니다.");
    }
}
