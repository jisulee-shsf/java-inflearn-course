package chap_07;

public class _08_Constructor_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 기본 생성자 호출
        Phone p1 = new Phone();
        /*
        기본 생성자 호출입니다.
        */

        // 2. 기본 생성자 및 사용자 정의 생성자 호출
        Phone p2 = new Phone("자바폰", "프로", 128, 1000000);
        System.out.println(p2.modelName);
        System.out.println(p2.modelNumber);
        /*
        기본 생성자 호출입니다. -> this()
        2번의 모델 번호를 발급했습니다.
        사용자 정의 생성자 호출입니다.
        자바폰
        2
        */
    }
}