package chap_07;

import chap_07.Classes.*;

public class _13_Overriding_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        MethodOverridingA mo1 = new MethodOverridingA();
        MethodOverridingB mo2 = new MethodOverridingB();
        MethodOverridingC mo3 = new MethodOverridingC();

        // 2-1. 메서드 호출(오버라이딩 전)
        mo1.feature1();
        mo2.feature1();
        mo3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature1입니다.
        자바폰3: feature1입니다.
        */

        // 2-2. 메서드 호출(오버라이딩 후)
        mo1.feature1();
        mo2.feature1();
        mo3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: MethodOverridingB에서 feature1의 오버라이딩입니다.
        자바폰3: MethodOverridingC에서 feature1의 오버라이딩입니다.
        */
    }
}