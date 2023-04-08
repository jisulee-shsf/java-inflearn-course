package chap_07.classes;

public class FinalA {
    // 1-1. 인스턴스 변수 선언
    public String modelName; // public final String modelName;

    // 1-2. 생성자 정의
    public FinalA() {
        this("자바폰1");
    }

    protected FinalA(String modelName) {
        this.modelName = modelName;
    }

    // 1-3. 메서드 정의
    public void feature1() { // public final void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}
