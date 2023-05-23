package chap_07;

public class _17_final_230406 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 & 메서드 호출
        FinalA f1 = new FinalA();
        f1.feature1(); // 자바폰1: feature1입니다.

        // 2-1. 인스턴스 변수의 값 변경 & 메서드 호출
        f1.modelName = "자바폰2";
        f1.feature1(); // 자바폰2: feature1입니다.

        /*
        // 2-2. final) 인스턴스 변수의 값 변경 시도 -> error
        f1.modelName = "자바자바폰";
        java: cannot assign a value to final variable modelName
        */

        // 3-1. 클래스 객체 생성 및 메서드 호출
        FinalB f2 = new FinalB();
        f2.feature1(); // 자바폰2: FinalB에서 feature1의 오버라이딩입니다.

        /*
        // 3-2. final) 메서드 오버라이딩 시도 -> error
        f2.feature1();
        java: feature1() in chap_07.Classes.FinalB cannot override feature1() in chap_07.Classes.FinalA
        overridden method is final
        */
    }
}

class FinalA {
    public String modelName;
    // public final String modelName;

    public FinalA() {
        this("자바폰1");
    }

    protected FinalA(String modelName) {
        this.modelName = modelName;
    }

    public void feature1() {
    // public final void feature1() {
        System.out.println(this.modelName + ": feature1입니다.");
    }
}

class FinalB extends FinalA {
    public FinalB() {
        super("자바폰2");
    }

    @Override
    public void feature1() {
        System.out.println(this.modelName + ": FinalB에서 feature1의 오버라이딩입니다.");
    }
}