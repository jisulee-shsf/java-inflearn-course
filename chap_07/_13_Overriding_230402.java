package chap_07;

import chap_07.Classes.*;

public class _13_Overriding_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        OverridingA o1 = new OverridingA();
        OverridingB o2 = new OverridingB();
        OverridingC o3 = new OverridingC();

        // 2-1. 오버라이딩 전) 메서드 호출
        o1.feature1();
        o2.feature1();
        o3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature1입니다.
        자바폰3: feature1입니다.
        */

        // 2-2. 오버라이딩 후) 메서드 호출
        o1.feature1();
        o2.feature1();
        o3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: OverridingB에서 feature1의 오버라이딩입니다.
        자바폰3: OverridingC에서 feature1의 오버라이딩입니다.
        */
    }
}
