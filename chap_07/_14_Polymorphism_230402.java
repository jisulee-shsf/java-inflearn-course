package chap_07;

import chap_07.Safety.Feature1;
import chap_07.Safety.Feature2;
import chap_07.Safety.Feature3;

public class _14_Polymorphism_230402 {
    public static void main(String[] args) {
        // 1. IS-A
        // Feature2 extends Feature1 -> Feature2 is a Feature1.
        // Feature3 extends Feature1 -> Feature3 is a Feature1.

        // 2. 클래스 객체 생성 및 메서드 호출
        Feature1 f1 = new Feature1();
        Feature2 f2 = new Feature2();
        Feature3 f3 = new Feature3();

        f1.featureAA();
        f2.featureAA();
        f3.featureAA();
        /*
        안전1: featureAA
        안전2: featureAA / 메서드 오버라이딩1
        안전3: featureAA / 메서드 오버라이딩2
        */

        // 2. 다형성 확인
        Feature1 fa = new Feature1();
        Feature1 fb = new Feature2();
        Feature1 fc = new Feature3();

        fa.featureAA();
        fb.featureAA();
        fc.featureAA();
        /*
        안전1: featureAA
        안전2: featureAA / 메서드 오버라이딩1
        안전3: featureAA / 메서드 오버라이딩2
        */

        Feature1[] features = new Feature1[3];
        features[0] = new Feature1();
        features[1] = new Feature2();
        features[2] = new Feature3();

        for (Feature1 f : features) {
            f.featureAA();
        }
        /*
        안전1: featureAA
        안전2: featureAA / 메서드 오버라이딩1
        안전3: featureAA / 메서드 오버라이딩2
        */

        // 3. instanceof 연산자를 활용한 형변환
        // fa.featureB();
        if (fb instanceof Feature2) {
            ((Feature2) fb).featureB();
        } // featureB

        // fa.featureC();
        if (fc instanceof Feature3) {
            ((Feature3) fc).featureC();
        } // featureC
    }
}
