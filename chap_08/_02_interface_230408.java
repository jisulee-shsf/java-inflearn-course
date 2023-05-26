package chap_08;

import chap_08.classes.checker.*;
import chap_08.classes.correcter.*;
import chap_08.classes.phone.*;

public class _02_interface_230408 {
    public static void main(String[] args) {
        // 1-1. 인터페이스 Checkable) 클래스 객체 생성 & 메서드 호출
        CheckA checkA = new CheckA();
        checkA.checkSth();

        CheckB checkB = new CheckB();
        checkB.checkSth();
        /*
        CheckA에서 checkSth을 시작합니다.
        CheckB에서 checkSth을 시작합니다.
        */

        // 1-2. 인터페이스 Correctable) 클래스 객체 생성 & 메서드 호출
        Correctable correctA = new CorrectA();
        correctA.correctSth();

        Correctable correctB = new CorrectB();
        correctB.correctSth();
        /*
        CorrectA에서 correctSth을 시작합니다.
        CorrectB에서 correctSth을 시작합니다.
        */

        // 2. 인터페이스 Checkable & Correctable) 클래스 객체 생성 & 메서드 호출
        Phone phone = new Phone();

        phone.setChecker(checkA);
        phone.setCorrecter(correctA);

        phone.checkSth();
        phone.correctSth();
        /*
        CheckA에서 checkSth을 시작합니다.
        CorrectA에서 correctSth을 시작합니다.
        */

        phone.setChecker(checkB);
        phone.setCorrecter(correctB);

        phone.checkSth();
        phone.correctSth();
        /*
        CheckB에서 checkSth을 시작합니다.
        CorrectB에서 correctSth을 시작합니다.
        */
    }
}