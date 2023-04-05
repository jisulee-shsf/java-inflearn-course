package chap_07;

public class _10_AccessModifier_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        PhoneUpdated pu = new PhoneUpdated();

        /*
        // 2. 인스턴스 변수 값 설정
        pu.modelPrice = 1000000;
        System.out.println(pu.modelPrice); // 1000000
        pu.modelPrice = -1000000; // 잘못된 값으로 설정될 수 있음
        System.out.println(pu.modelPrice); // -1000000

        // 3. public -> private) 접근 제어자 변경 및 메서드 호출
        pu.modelPrice = 1000000;
        System.out.println(pu.modelPrice); // java: modelPrice has private access in chap_07.PhoneUpdated
        pu.modelPrice = -1000000;
        System.out.println(pu.modelPrice); // java: modelPrice has private access in chap_07.PhoneUpdated
        */

        // 4. getter & setter) 메서드 호출
        pu.setModelPrice(1500000);
        System.out.println(pu.getModelPrice()); // 1500000
    }
}

/*
// 접근 제어자
public class PhoneUpdated {
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
*/
