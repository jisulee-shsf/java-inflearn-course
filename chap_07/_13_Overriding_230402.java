package chap_07;

import chap_07.Safety.*;

public class _13_Overriding_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        MethodOverriding1 mo1 = new MethodOverriding1();
        MethodOverriding2 mo2 = new MethodOverriding2();
        MethodOverriding3 mo3 = new MethodOverriding3();

        // 2-1. 메서드 호출(오버라이딩 전)
        mo1.feature1();
        mo2.feature1();
        mo3.feature1();
        /*
        안전1: feature1입니다.
        안전2: feature1입니다.
        안전3: feature1입니다.
        */

        // 2-2. 메서드 호출(오버라이딩 후)
        mo1.feature1();
        mo2.feature1();
        mo3.feature1();
        /*
        안전1: feature1입니다.
        안전2: MethodOverriding2에서 feature1의 오버라이딩입니다.
        안전3: MethodOverriding3에서 feature1의 오버라이딩입니다.
        */
    }
}