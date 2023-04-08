package chap_07.classes;

public class SuperB extends SuperA { // 자식 클래스
    // 2-1. 생성자 호출
    public SuperB() {
        super("super자바폰2");
    }

    // 2-2. 메서드 정의
    public void feature2() {
        super.feature1(); // 조상 클래스 메서드 호출
        System.out.println(this.modelName + ": feature2입니다.");
    }
}