package chap_08.classes;

public class AbstractClassB extends AbstractClassA {

    // 추상 메서드 -> 메서드 구현
    @Override
    public void findSth() {
        System.out.println("AbstractClassB에서 findSth을 시작합니다.");
    }
}
