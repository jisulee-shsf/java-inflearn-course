package chap_07;

import chap_07.classes.*;

public class _12_Inheritance_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 인스턴스 변수 출력
        InheritanceA i1 = new InheritanceA();
        InheritanceB i2 = new InheritanceB();
        InheritanceC i3 = new InheritanceC();
        
        System.out.println(i1.modelName); // 자바폰1
        System.out.println(i2.modelName); // 자바폰2
        System.out.println(i3.modelName); // 자바폰3

       
        // 2-1. 상속) 메서드 호출
        i1.feature1();
        i2.feature1();
        i3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature1입니다.
        자바폰3: feature1입니다.
        */

        // 2-2. 자손 클래스) 메서드 호출
        i2.feature2();
        i3.feature3();
        /*
        자바폰2: feature2입니다.
        자바폰3: feature3입니다.
        */
    }
}
