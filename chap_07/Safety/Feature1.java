package chap_07.Safety;

// ▶︎ 10. [_12_Inheritance_230402] 상속

public class Feature1 {
    // 1) 인스턴스 변수 선언
    public String modelName;

    // 2) 인스턴스 변수 값 설정
    public Feature1() {
        this.modelName = "안전1";
    }

    // 3) 메서드 정의
    public void featureA() {
        System.out.println(this.modelName + ": featureA");
    }
}