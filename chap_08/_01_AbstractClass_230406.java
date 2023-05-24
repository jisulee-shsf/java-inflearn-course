package chap_08;

public class _01_AbstractClass_230406 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 & 메서드 호출
        AbstractClassB ac1 = new AbstractClassB();
        ac1.findSth();
        AbstractClassC ac2 = new AbstractClassC();
        ac2.findSth();
        /*
        AbstractClassB에서 findSth을 시작합니다.
        AbstractClassC에서 findSth을 시작합니다.
        */

        // 2. 다형성) 클래스 객체 생성 & 메서드 호출
        AbstractClassA ac3 = new AbstractClassB();
        ac3.findSth();
        AbstractClassA ac4 = new AbstractClassC();
        ac4.findSth();
        /*
        AbstractClassB에서 findSth을 시작합니다.
        AbstractClassC에서 findSth을 시작합니다.
        */
    }
}

abstract class AbstractClassA { // 추상 클래스
    /* 어떤 기능을 수행할 목적으로 작성했는지 설명 삽입 */
    public abstract void findSth(); // 추상 메서드
}

class AbstractClassB extends AbstractClassA {
    @Override
    public void findSth() { // 추상 메서드 구현
        System.out.println("AbstractClassB에서 findSth을 시작합니다.");
    }
}

class AbstractClassC extends AbstractClassA {
    @Override
    public void findSth() { // 추상 메서드 구현
        System.out.println("AbstractClassC에서 findSth을 시작합니다.");
    }
}
