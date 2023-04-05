package chap_07.Classes;

public class PolymorphismA { // 조상 클래스
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public PolymorphismA() {
        this.modelName = "자바폰1";
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}
