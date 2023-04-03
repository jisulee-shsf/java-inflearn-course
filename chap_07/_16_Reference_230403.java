package chap_07;

import chap_07.Safety.Feature1;
import chap_07.Safety.Feature2;

public class _16_Reference_230403 {
    public static void main(String[] args) {
        // 1-1. 기본 자료형
        int[] i = new int[2];
        System.out.println(i[0]); // 0

        // 1-2. 기본 자료형 예시
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

        // 2-1. 참조 자료형
        Feature1[] f = new Feature1[2];
        System.out.println(f[0] == null); // true

        // 2-2. 참조 자료형 예시1
        Feature1 f1 = new Feature1();
        Feature2 f2 = new Feature2();
        System.out.println(f1.modelName); // 안전1
        System.out.println(f2.modelName); // 안전2

        f1 = f2;
        System.out.println(f1.modelName); // 안전2
        System.out.println(f2.modelName); // 안전2

        f1.modelName = "테스트1"; // f1과 f2가 같은 객체를 참조하고 있으므로, 동일 값 출력
        System.out.println(f1.modelName); // "테스트1"
        System.out.println(f2.modelName); // "테스트1"

        // 2-3. 참조 자료형 예시2
        Feature1 t1 = new Feature1();
        Feature1 t2 = t1;
        Feature1 t3 = t1;

        t1.modelName = "안전기능1"; // t1, t2, t3가 같은 객체를 참조하고 있으므로, 동일 값 출력
        System.out.println(t1.modelName); // 안전기능1
        System.out.println(t2.modelName); // 안전기능1
        System.out.println(t3.modelName); // 안전기능1

        changeModelName(t2); // t1, t2, t3가 같은 객체를 참조하고 있으므로, 동일 값 출력
        System.out.println(t1.modelName); // 오류
        System.out.println(t2.modelName); // 오류
        System.out.println(t3.modelName); // 오류

        // 2-4. 참조 끊기
        t2 = null;
        t3 = null;
        System.out.println(t1.modelName); // 오류
        System.out.println(t2.modelName); // NullPointerException
        System.out.println(t3.modelName); // NullPointerException

    }
    public static void changeModelName(Feature1 f) {
        f.modelName = "오류";
    }

}