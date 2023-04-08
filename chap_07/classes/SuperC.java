package chap_07.classes;

public class SuperC extends SuperA { // 자식 클래스
    // 3-1. 생성자 호출
    public SuperC() {
        super("super자바폰3");
    }

    // 3-2. 메서드 정의
    public void feature3() {
        super.feature1(); // 조상 클래스 메서드 호출
        System.out.println(this.modelName + ": feature3입니다.");
    }
}