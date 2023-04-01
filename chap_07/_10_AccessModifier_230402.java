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

        // 3. 접근 제어자 private 사용
        // java: modelPrice has private access in chap_07.PhoneUpdated
        pu.modelPrice = 1000000;
        System.out.println(pu.modelPrice);

        pu.modelPrice = -1000000;
        System.out.println(pu.modelPrice);
        */

        // 4. Getter & Setter 접근
        pu.setModelPrice(1500000);
        System.out.println(pu.getModelPrice()); // 1500000
    }
}