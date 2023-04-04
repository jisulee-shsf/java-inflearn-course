package chap_07;

import chap_07.Safety.*;

public class _12_Inheritance_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 및 호출
        inheritance1 i1 = new inheritance1();
        inheritance2 i2 = new inheritance2();
        inheritance3 i3 = new inheritance3();

        System.out.println(i1.modelName); // 안전1
        System.out.println(i2.modelName); // 안전2
        System.out.println(i3.modelName); // 안전3

        // 2. 메서드 호출(상속 전)
        // Feature1 -> System.out.println("featureA")
        i1.feature1();
        i2.feature2();
        i3.feature3();
        /*
        안전1: feature1입니다.
        안전2: feature2입니다.
        안전3: feature3입니다.
        */

        System.out.println();

        // 3-1. 메서드 호출(상속 후)
        i1.feature1();
        i2.feature2();
        i3.feature3();
        /*
        안전1: feature1입니다.
        안전2: feature2입니다.
        안전3: feature3입니다.
        */

        // 3-2. 메서드 호출(자손 클래스)
        i2.feature2();
        i3.feature3();
        /*
        안전2: feature2입니다.
        안전3: feature3입니다.
        */
    }
}

/*
// 상속 전
public class inheritance1 {
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public inheritance1() {
        // 인스턴스 변수 초기화
        this.modelName = "안전1";
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}

public class inheritance2 {
    // 2-1. 인스턴스 변수 선언
    public String modelName;

    // 2-2. 생성자 정의
    public inheritance2() {
        // 인스턴스 변수 초기화
        this.modelName = "안전2";
    }

    // 2-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }

    public void feature2() {
        System.out.println(this.modelName + ": feature2입니다.");
    }
}

public class inheritance3 {
    // 3-1. 인스턴스 변수 선언
    public String modelName;

    // 3-2. 생성자 정의
    public inheritance3() {
        // 인스턴스 변수 초기화
        this.modelName = "안전3";
    }

    // 3-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }

    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}
*/

/*
// 상속 후
// 1. 조상 클래스
public class inheritance1 {
    // 1-1. 인스턴스 변수 선언
    public String modelName;

    // 1-2. 생성자 정의
    public inheritance1() {
        // 인스턴스 변수 초기화
        this.modelName = "안전1";
    }

    // 1-3. 메서드 정의
    public void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}

// 2. 자손 클래스
public class inheritance2 extends inheritance1 {
    // 2-1. 생성자 정의
    public inheritance2() {
        // 인스턴스 변수 초기화
        this.modelName = "안전2";
    }

    // 2-2. 메서드 정의
    public void feature2() {
        System.out.println(this.modelName + ": feature2입니다.");
    }
}

// 3. 자손 클래스
public class inheritance3 extends inheritance1 {
    // 3-1. 생성자 정의
    public inheritance3() {
        // 인스턴스 변수 초기화
        this.modelName = "안전3";
    }

    // 3-2. 메서드 정의
    public void feature3() {
        System.out.println(this.modelName + ": feature3입니다.");
    }
}
*/
