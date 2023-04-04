package chap_07.Classes;

public class InheritanceB extends InheritanceA { // 자손 클래스
    // 2-1. 생성자 정의
    public InheritanceB() {
        // 인스턴스 변수 초기화
        this.modelName = "자바폰2";
    }

    // 2-2. 메서드 정의
    public void feature2() {
        System.out.println(this.modelName + ": feature2입니다.");
    }
}
