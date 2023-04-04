package chap_07;

import chap_07.Classes.*;

public class _12_Inheritance_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 호출
        InheritanceA i1 = new InheritanceA();
        InheritanceB i2 = new InheritanceB();
        InheritanceC i3 = new InheritanceC();

        System.out.println(i1.modelName); // 자바폰1
        System.out.println(i2.modelName); // 자바폰2
        System.out.println(i3.modelName); // 자바폰3

        // 2. 메서드 호출(상속 전)
        // Feature1 -> System.out.println("featureA")
        i1.feature1();
        i2.feature2();
        i3.feature3();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature2입니다.
        자바폰3: feature3입니다.
        */

        System.out.println();

        // 3-1. 메서드 호출(상속 후)
        i1.feature1();
        i2.feature2();
        i3.feature3();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature2입니다.
        자바폰3: feature3입니다.
        */

        // 3-2. 메서드 호출(자손 클래스)
        i2.feature2();
        i3.feature3();
        /*
        자바폰2: feature2입니다.
        자바폰3: feature3입니다.
        */
    }
}