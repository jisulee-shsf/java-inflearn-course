package chap_07.Classes;

public class FinalB extends FinalA {
    // 2-1. 생성자 정의
    public FinalB() {
        super("자바자바폰");
    }

    // 2-1. 오버라이딩
    @Override
    public void feature1() {
        System.out.println(this.modelName + ": FinalB에서 feature1의 오버라이딩입니다.");
    }
}