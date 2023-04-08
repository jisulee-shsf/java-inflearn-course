package chap_07.classes;

public class OverridingC extends OverridingA {

    // 3-1. 생성자 정의
    public OverridingC() {
        this.modelName = "자바폰3";
    }

    // 3-2. 오버라이딩) 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": OverridingC에서 feature1의 오버라이딩입니다.");
    }

    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}
