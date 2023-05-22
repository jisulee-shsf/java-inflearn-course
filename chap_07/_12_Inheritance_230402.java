package chap_07;

public class _12_Inheritance_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        InheritanceA i1 = new InheritanceA();
        InheritanceB i2 = new InheritanceB();
        InheritanceC i3 = new InheritanceC();

        // 2. 인스턴스 변수 출력
        System.out.println(i1.modelName); // 자바폰1
        System.out.println(i2.modelName); // 자바폰2
        System.out.println(i3.modelName); // 자바폰3

       
        // 3-1. 조상 & 자손 클래스) 메서드 호출
        i1.feature1();
        i2.feature1();
        i3.feature1();
        /*
        자바폰1: feature1입니다.
        자바폰2: feature1입니다.
        자바폰3: feature1입니다.
        */

        // 3-2. 자손 클래스) 메서드 호출
        i2.feature2();
        i3.feature3();
        /*
        자바폰2: feature2입니다.
        자바폰3: feature3입니다.
        */
    }
}

class InheritanceA { // 조상 클래스
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public InheritanceA() {
        this.modelName = "자바폰1";
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}

class InheritanceB extends InheritanceA { // 자손 클래스1
    // 2-1. 생성자 정의
    public InheritanceB() {
        this.modelName = "자바폰2";
    }

    // 2-2. 메서드 정의
    public void feature2() {
        System.out.println(this.modelName + ": feature2입니다.");
    }
}

class InheritanceC extends InheritanceA { // 자손 클래스2
    // 3-1. 생성자 정의
    public InheritanceC() {
        this.modelName = "자바폰3";
    }

    // 3-2. 메서드 정의
    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}