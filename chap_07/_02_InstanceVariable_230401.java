package chap_07;

public class _02_InstanceVariable_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone2 p1 = new Phone2();
        Phone2 p2 = new Phone2();

        // 2. 인스턴스 변수에 값 저장 및 출력
        p1.modelName = "자바폰1";
        p1.modelType = "프로";
        p1.modelCapacity = 128;
        p1.modelPrice = 1000000;

        System.out.println(p1.modelName);
        System.out.println(p1.modelType);
        System.out.println(p1.modelCapacity);
        System.out.println(p1.modelPrice);
        /*
        자바폰1
        프로
        128
        1000000
        */

        p2.modelName = "자바폰2";
        p2.modelType = "프로맥스";
        p2.modelCapacity = 256;
        p2.modelPrice = 1500000;

        System.out.println(p2.modelName);
        System.out.println(p2.modelType);
        System.out.println(p2.modelCapacity);
        System.out.println(p2.modelPrice);
        /*
        자바폰2
        프로맥스
        256
        1500000
        */
    }
}

class Phone2 {
    String modelName;
    String modelType;
    int modelCapacity;
    int modelPrice;
}