package chap_07.classes;

public class InheritanceC extends InheritanceA { // 자손 클래스
    // 3-1. 생성자 정의
    public InheritanceC() {
        this.modelName = "자바폰3";
    }

    // 3-2. 메서드 정의
    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}
