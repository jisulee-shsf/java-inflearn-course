package chap_07;

public class PhoneUpdated {
    // ▶︎ [_10_AccessModifier_230402] 접근 제어자
    // 1. private) 인스턴스 변수 선언
    private int modelPrice; // 모델 가격

    // 2. getter & setter 메서드 정의
    public int getModelPrice() {
        return modelPrice;
    }
    public void setModelPrice(int modelPrice) {
        this.modelPrice = modelPrice;
    }
}