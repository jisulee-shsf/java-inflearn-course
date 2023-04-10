package chap_08;

import chap_08.classes.phone.InterfaceB;
import chap_08.classes.checker.*;
import chap_08.classes.correcter.*;

public class _02_interface_230408 {
    public static void main(String[] args) {
        // 1-1. 인터페이스 Checkable) 클래스 객체 생성 및 메서드 호출
        CheckA checkA = new CheckA();
        checkA.checkSth();
        Checkable checkB = new CheckB();
        checkB.checkSth();
        /*
        CheckA에서 checkSth을 시작합니다.
        CheckB에서 checkSth을 시작합니다.
        */

        // 1-2. 인터페이스 Correctable) 클래스 객체 생성 및 메서드 호출
        CorrectA correctA = new CorrectA();
        correctA.correctSth();
        Correctable correctB = new CorrectB();
        correctB.correctSth();
        /*
        CorrectA에서 correctSth을 시작합니다.
        CorrectB에서 correctSth을 시작합니다.
        */

        // 2. 추상 클래스 & 인터페이스) 클래스 객체 생성 및 메서드 호출
        InterfaceB interfaceB = new InterfaceB();

        interfaceB.setChecker(checkA);
        interfaceB.setCorrecter(correctA);
        interfaceB.checkSth();
        interfaceB.correctSth();
        /*
        CheckA에서 checkSth을 시작합니다.
        CorrectA에서 correctSth을 시작합니다.
        */

        interfaceB.setChecker(checkB);
        interfaceB.setCorrecter(correctB);
        interfaceB.checkSth();
        interfaceB.correctSth();
        /*
        CheckB에서 checkSth을 시작합니다.
        CorrectB에서 correctSth을 시작합니다.
        */
    }
}