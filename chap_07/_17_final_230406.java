package chap_07;

import chap_07.classes.FinalA;
import chap_07.classes.FinalB;

public class _17_final_230406 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 메서드 호출
        FinalA f1 = new FinalA();
        f1.feature1(); // 자바폰1: feature1입니다.

        // 2-1. 인스턴스 변숫값 변경 및 메서드 호출
        f1.modelName = "자바폰2";
        f1.feature1(); // 자바폰2: feature1입니다.

        /*
        // 2-2. 인스턴스 변수에 키워드 final 사용) 인스턴스 변숫값 변경 시도 -> 변숫값 변경 불가
        f1.modelName = "자바폰3";
        java: cannot assign a value to final variable modelName
        */

        // 3-1. 클래스 객체 생성 및 메서드 호출
        FinalB f2 = new FinalB();
        f2.feature1(); // 자바자바폰: FinalB에서 feature1의 오버라이딩입니다.

        /*
        // 3-2. 메서드에 키워드 final 사용) 메서드 호출 시도 -> 자손 클래스에 오버라이딩 불가
        f2.feature1();
        java: feature1() in chap_07.Classes.FinalB cannot override feature1() in chap_07.Classes.FinalA
        overridden method is final
        */
    }
}
