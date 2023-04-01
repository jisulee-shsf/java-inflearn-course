package chap_07;

import chap_07.Safety.Feature1;
import chap_07.Safety.Feature2;
import chap_07.Safety.Feature3;

public class _13_MethodOverriding_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Feature1 f1 = new Feature1();
        Feature2 f2 = new Feature2();
        Feature3 f3 = new Feature3();

        // 2-1. 메서드 오버라이딩 전 메서드 호출
        f1.featureAA();
        f2.featureAA();
        f3.featureAA();
        /*
        안전1: featureAA
        안전2: featureAA
        안전3: featureAA
        */

        // 2-2. 메서드 오버라이딩 후 메서드 호출
        f1.featureAA();
        f2.featureAA();
        f3.featureAA();
        /*
        안전1: featureAA
        안전2: featureAA / 메서드 오버라이딩1 -> 부모 메서드 내용 변경 확인
        안전3: featureAA / 메서드 오버라이딩2 -> 부모 메서드 내용 변경 확인
        */
    }
}