package chap_07.Classes;

public class PolymorphismC extends PolymorphismA { // 자손 클래스
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public PolymorphismC() {
        // 인스턴스 변수 초기화
        this.modelName = "자바폰3";
    }

    // 1-3. 메서드 정의
    public void feature3() {
        System.out.println(this.modelName + ": PolymorphismC 형변환을 통해 호출한 feature3입니다.");
    }
}
