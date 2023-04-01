package chap_07.Safety;

// ▶︎ 10. [_12_Inheritance_230402] 상속

public class Feature3 extends Feature1 { // Feature1 클래스 상속
    /*
    public String modelName;

    public void featureA() {
        System.out.println(this.modelName + ": featureA");
    }
    */

    // 1) 인스턴스 변수 값 설정
    public Feature3() {
        this.modelName = "안전3";
    }

    // 2) 메서드 정의
    public void featureC() {
        System.out.println("featureC");
    }
}