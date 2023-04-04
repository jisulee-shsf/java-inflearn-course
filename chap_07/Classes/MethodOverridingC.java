package chap_07.Classes;

public class MethodOverridingC extends MethodOverridingA {

    // 3-1. 생성자 정의
    public MethodOverridingC() {
        // 인스턴스 변수 초기화
        this.modelName = "자바폰3";
    }

    // 3-2. 메서드 정의(오버라이딩)
    public void feature1() {
        System.out.println(this.modelName + ": MethodOverridingC에서 feature1의 오버라이딩입니다.");
    }

    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}
