package chap_07;

import chap_07.Classes.PolymorphismA;
import chap_07.Classes.PolymorphismB;
import chap_07.Classes.PolymorphismC;

public class _14_Polymorphism_230402 {
    public static void main(String[] args) {
        // 1-1. 클래스 객체 생성
        PolymorphismA p1 = new PolymorphismA();
        PolymorphismB p2 = new PolymorphismB();
        PolymorphismC p3 = new PolymorphismC();

        // 1-2. 메서드 호출
        p1.feature1();
        p2.feature1();
        p3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        */

        // 2-1. 다형성) 클래스 객체 생성
        PolymorphismA p4 = new PolymorphismA();
        PolymorphismA p5 = new PolymorphismB();
        PolymorphismA p6 = new PolymorphismC();

        // 2-2. 다형성) 메서드 호출
        p4.feature1();
        p5.feature1();
        p6.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        */

        PolymorphismA[] ps = new PolymorphismA[3];
        ps[0] = new PolymorphismA();
        ps[1] = new PolymorphismB();
        ps[2] = new PolymorphismC();

        for (PolymorphismA p : ps) {
            p.feature1();
        }
        /*
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        */

        // 3. instanceof) 형변환
        // p4.featureB(); p4 객체에서만 동작하는 메서드 호출 불가 -> 형변환으로 메서드 호출 가능
        if (p5 instanceof PolymorphismB) {
            ((PolymorphismB) p5).feature2();
        } // 자바폰2: PolymorphismB 형변환을 통해 호출한 feature2입니다.

        if (p6 instanceof PolymorphismC) {
            ((PolymorphismC) p6).feature3();
        } // 자바폰3: PolymorphismC 형변환을 통해 호출한 feature3입니다.
    }
}
