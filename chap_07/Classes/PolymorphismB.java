package chap_07.Classes;

public class PolymorphismB extends PolymorphismA { // 자식 클래스
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public PolymorphismB() {
        // 인스턴스 변수 초기화
        this.modelName = "자바폰2";
    }

    // 1-3. 메서드 정의
    public void feature2() {
        System.out.println(this.modelName + ": PolymorphismB 형변환을 통해 호출한 feature2입니다.");
    }
}
