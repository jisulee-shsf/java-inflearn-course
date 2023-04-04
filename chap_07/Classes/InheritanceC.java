package chap_07.Classes;

public class InheritanceC extends InheritanceA { // 자손 클래스
    // 3-1. 생성자 정의
    public InheritanceC() {
        // 인스턴스 변수 초기화
        this.modelName = "자바폰3";
    }

    // 3-2. 메서드 정의
    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}