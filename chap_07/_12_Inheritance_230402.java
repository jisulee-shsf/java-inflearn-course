package chap_07;

import chap_07.Safety.Feature1; // 부모 클래스
import chap_07.Safety.Feature2; // 자식 클래스
import chap_07.Safety.Feature3; // 자식 클래스

public class _12_Inheritance_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 호출
        Feature1 f1 = new Feature1();
        Feature2 f2 = new Feature2();
        Feature3 f3 = new Feature3();

        System.out.println(f1.modelName);
        System.out.println(f2.modelName);
        System.out.println(f3.modelName);
        /*
        안전1
        안전2
        안전3
        */

        // 2-1. Feature1 클래스 상속 전
        // Feature1 -> System.out.println("featureA")
        f1.featureA();
        f2.featureA();
        f3.featureA();
        /*
        featureA
        featureA
        featureA
        */

        // 2-2. Feature1 클래스 상속 후 -> 변동 없음 확인
        // Feature1 -> System.out.println(this.modelName + ": featureA")
        f1.featureA();
        f2.featureA();
        f3.featureA();
        /*
        안전1: featureA
        안전2: featureA
        안전3: featureA
        */
    }
}