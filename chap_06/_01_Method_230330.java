package chap_06;

public class _01_Method_230330 {
    // 1. 메서드 정의
    public static void sayHello() {
        System.out.println("메서드입니다."); // 메서드입니다.
    }

    // 2. 메서드 호출
    public static void main(String[] args) {
        System.out.println("메서드 호출 전입니다.");
        sayHello();
        System.out.println("메서드 호출 후입니다.");
        /*
        메서드 호출 전입니다.
        메서드입니다.
        메서드 호출 후입니다.
        */
    }
}
