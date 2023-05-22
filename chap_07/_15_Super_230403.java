package chap_07;

public class _15_Super_230403 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        SuperB s2 = new SuperB();
        SuperC s3 = new SuperC();

        // 2-1. 메서드 호출
        s2.feature2();
        s3.feature3();
        /*
        자바폰2: feature2입니다.
        자바폰3: feature3입니다.
        */

        // 2-2. 생성자 super()) 메서드 호출
        s2.feature2();
        s3.feature3();
        /*
        super자바폰2: feature2입니다.
        super자바폰3: feature3입니다.
        */

        // 3-1. 참조 변수 super) 메서드 호출
        s2.feature2();
        s3.feature3();
        /*
        super자바폰2: 참조 변수 super를 사용한 feature1입니다.
        super자바폰2: feature2입니다.
        super자바폰3: 참조 변수 super를 사용한 feature1입니다.
        super자바폰3: feature3입니다.
        */
    }
}

class SuperA {
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public SuperA() {
        this("super자바폰1");
    }

    protected SuperA(String modelName) {
        this.modelName = modelName;
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": 참조 변수 super를 사용한 feature1입니다.");
    }
}

class SuperB extends SuperA {
    // 2-1. 생성자 호출
    public SuperB() {
        super("super자바폰2"); // 조상 클래스의 생성자에 접근
    }

    // 2-2. 메서드 정의
    public void feature2() {
        super.feature1(); // 조상 클래스의 메서드 호출
        System.out.println(this.modelName + ": feature2입니다.");
    }
}

class SuperC extends SuperA {
    // 3-1. 생성자 호출
    public SuperC() {
        super("super자바폰3");  // 조상 클래스의 생성자에 접근
    }

    // 3-2. 메서드 정의
    public void feature3() {
        super.feature1(); // 조상 클래스의 메서드 호출
        System.out.println(this.modelName + ": feature3입니다.");
    }
}