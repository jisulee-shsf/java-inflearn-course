package chap_08;

import chap_08.*;

public class _01_AbstractClass_230406 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 메서드 호출
        AbstractClassB v1 = new AbstractClassB();
        v1.findSth(); // AbstractClassB에서 findSth을 시작합니다.

        AbstractClassC v2 = new AbstractClassC();
        v2.findSth(); // AbstractClassC에서 findSth을 시작합니다.

        // 2. 다형성) 클래스 객체 생성 및 메서드 호출
        AbstractClassA v3 = new AbstractClassB();
        v3.findSth(); // AbstractClassB에서 findSth을 시작합니다.

        AbstractClassA v4 = new AbstractClassC();
        v4.findSth(); // AbstractClassC에서 findSth을 시작합니다.
    }
}
