package chap_07;

import chap_07.classes.PolymorphismA;
import chap_07.classes.PolymorphismB;
import chap_07.classes.PolymorphismC;

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
        PolymorphismA pp1 = new PolymorphismA();
        PolymorphismA pp2 = new PolymorphismB();
        PolymorphismA pp3 = new PolymorphismC();

        // 2-2. 다형성) 메서드 호출
        pp1.feature1();
        pp1.feature1();
        pp1.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        */

        PolymorphismA[] pps = new PolymorphismA[3];
        pps[0] = new PolymorphismA();
        pps[1] = new PolymorphismB();
        pps[2] = new PolymorphismC();

        for (PolymorphismA p : pps) {
            p.feature1();
        }
        /*
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        자바폰1: feature1입니다.
        */

        // 3. instanceof) 형변환
        // pp2.feature2(); -> pp2 객체에서만 동작하는 메서드 호출 불가 -> 형변환으로 메서드 호출
        if (pp2 instanceof PolymorphismB) {
            ((PolymorphismB) pp2).feature2();
        } // 자바폰2: PolymorphismB 형변환을 통해 호출한 feature2입니다.

        // pp3.feature3(); -> pp2 객체에서만 동작하는 메서드 호출 불가 -> 형변환으로 메서드 호출
        if (pp3 instanceof PolymorphismC) {
            ((PolymorphismC) pp3).feature3();
        } // 자바폰3: PolymorphismC 형변환을 통해 호출한 feature3입니다.
    }
}