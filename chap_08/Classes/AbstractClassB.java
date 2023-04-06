package chap_08.Classes;

public class AbstractClassB extends AbstractClassA {

    // 추상 메서드 -> 메서드 정의
    @Override
    public void findSth() {
        System.out.println("AbstractClassB에서 findSth을 시작합니다.");
    }
}
