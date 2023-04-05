package chap_07.Classes;

public class SuperA { // 조상 클래스
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public SuperA() {
        this("super자바폰1");
    }

    protected SuperA(String modelName) {
        this.modelName = modelName;
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": 참조 변수 super를 사용한 feature1입니다.");
    }
}
