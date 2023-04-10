package chap_08.classes.phone;

import chap_08.classes.checker.Checkable;
import chap_08.classes.correcter.Correctable;

public class InterfaceB extends InterfaceA implements Checkable, Correctable {
    // 1. 인터페이스 변수 선언
    private Checkable checker;
    private Correctable correcter;

    // 2. setter
    public void setChecker(Checkable checker) {
        this.checker = checker;
    }

    public void setCorrecter(Correctable correcter) {
        this.correcter = correcter;
    }

    // 3-1. 추상 클래스) 메서드 구현
    @Override
    public void findSth() {
        System.out.println("InterfaceTestB에서 findSth을 시작합니다.");
    }

    // 3-2. 인터페이스) 메서드 구현
    @Override
    public void checkSth() {
        checker.checkSth();
    }

    @Override
    public void correctSth() {
        correcter.correctSth();
    }
}