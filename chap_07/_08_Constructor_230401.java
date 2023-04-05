package chap_07;

public class _08_Constructor_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 기본 생성자 호출
        Phone p1 = new Phone();
        /*
        기본 생성자 호출입니다.
        1번의 모델 번호를 발급했습니다.
        */

        // 2. this()) 기본 ・ 사용자 정의 생성자 호출
        Phone p2 = new Phone("자바폰", "프로", 128, 1000000);
        System.out.println(p2.modelName);
        System.out.println(p2.modelType);
        System.out.println(p2.modelCapacity);
        System.out.println(p2.modelPrice);
        System.out.println(p2.modelNumber);
        /*
        기본 생성자 호출입니다.
        2번의 모델 번호를 발급했습니다.
        사용자 정의 생성자 호출입니다.
        자바폰
        프로
        128
        1000000
        2
        */
    }
}

/*
// 생성자
public class Phone {
    // 1. 인스턴스 및 클래스 변수 선언
    int modelNumber; // 모델 번호
    static int modelNumberCounter = 0; // modelNumber 증가

    // 2. 기본 생성자
    Phone() {
        System.out.println("기본 생성자 호출입니다. ");
        this.modelNumber = ++modelNumberCounter;
        System.out.println(this.modelNumber + "번의 모델 번호를 발급했습니다.");
    }

    // 3. 사용자 정의 생성자
    Phone(String modelName, String modelType, int modelCapacity, int modelPrice) {
        this(); // 기본 생성자 호출
        System.out.println("사용자 정의 생성자 호출입니다."); // 인스턴스 변수의 초기화 코드
        this.modelName = modelName;
        this.modelType = modelType;
        this.modelCapacity = modelCapacity;
        this.modelPrice = modelPrice;
    }
}
*/
