package chap_07;

public class _16_Reference_230403 {
    public static void main(String[] args) {
        // 1-1. 기본형
        int[] i = new int[2];
        System.out.println(i[0]); // 0

        // 1-2. 기본형 예시
        int a = 1;
        int b = 2;
        System.out.println(a); // 1
        System.out.println(b); // 2

        a = b;
        System.out.println(a); // 2
        System.out.println(b); // 2

        a = 3;
        System.out.println(a); // 3
        System.out.println(b); // 2 -> a와 관계없이 값 유지

        // 2-1. 참조형
        ReferenceA[] s = new ReferenceA[2];
        System.out.println(s[0] == null); // true

        // 2-2. 참조형 예시
        ReferenceA s1 = new ReferenceA();
        ReferenceB s2 = new ReferenceB();
        System.out.println(s1.modelName); // super자바폰1
        System.out.println(s2.modelName); // super자바폰2

        s1 = s2;
        System.out.println(s1.modelName); // super자바폰2
        System.out.println(s2.modelName); // super자바폰2

        s1.modelName = "테스트"; // s1과 s2가 같은 객체를 참조하고 있으므로, 동일한 값 출력
        System.out.println(s1.modelName); // "테스트"
        System.out.println(s2.modelName); // "테스트"

        // 2-3. 참조 끊기
        s2 = null;
        System.out.println(s1.modelName); // "테스트"
        System.out.println(s2.modelName); // NullPointerException
    }
}

class ReferenceA {
    public String modelName;

    public ReferenceA() {
        this("super자바폰1");
    }

    protected ReferenceA(String modelName) {
        this.modelName = modelName;
    }
}

class ReferenceB extends ReferenceA {
    public ReferenceB() {
        super("super자바폰2");
    }
}