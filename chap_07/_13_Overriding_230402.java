package chap_07;

public class _13_Overriding_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        OverridingA o1 = new OverridingA();
        OverridingB o2 = new OverridingB();
        OverridingC o3 = new OverridingC();

        // 2-1. 오버라이딩 전) 메서드 호출
        o1.feature1();
        o2.feature1();
        o3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature1입니다.
        자바폰3: feature1입니다.
        */

        // 2-2. 오버라이딩 후) 메서드 호출
        o1.feature1();
        o2.feature1();
        o3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: OverridingB에서 feature1의 오버라이딩입니다.
        자바폰3: OverridingC에서 feature1의 오버라이딩입니다.
        */
    }
}

class OverridingA {
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public OverridingA() {
        this.modelName = "자바폰1";
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}

class OverridingB extends OverridingA {

    // 2-1. 생성자 정의
    public OverridingB() {
        this.modelName = "자바폰2";
    }

    // 2-2. 오버라이딩) 메서드 정의
    @Override
    public void feature1() {
        System.out.println(this.modelName + ": OverridingB에서 feature1의 오버라이딩입니다.");
    }

    public void feature2() {
        System.out.println(this.modelName + ": feature2입니다.");
    }
}

class OverridingC extends OverridingA {

    // 3-1. 생성자 정의
    public OverridingC() {
        this.modelName = "자바폰3";
    }

    // 3-2. 오버라이딩) 메서드 정의
    @Override
    public void feature1() {
        System.out.println(this.modelName + ": OverridingC에서 feature1의 오버라이딩입니다.");
    }

    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}