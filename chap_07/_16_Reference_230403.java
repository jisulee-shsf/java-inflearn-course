package chap_07;

import chap_07.Classes.SuperA;
import chap_07.Classes.SuperB;

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
        SuperA[] s = new SuperA[2];
        System.out.println(s[0] == null); // true

        // 2-2. 참조형 예시1
        SuperA s1 = new SuperA();
        SuperB s2 = new SuperB();
        System.out.println(s1.modelName); // super자바폰1
        System.out.println(s2.modelName); // super자바폰2

        s1 = s2;
        System.out.println(s1.modelName); // super자바폰2
        System.out.println(s2.modelName); // super자바폰2

        s1.modelName = "테스트"; // s1과 s2가 같은 객체를 참조하고 있으므로, 동일한 값 출력
        System.out.println(s1.modelName); // "테스트"
        System.out.println(s2.modelName); // "테스트"

        // 2-3. 참조형 예시2
        SuperA s3 = new SuperA();
        SuperA s4 = s3;
        SuperA s5 = s3;

        s1.modelName = "안전기능1"; // t1, t2, t3가 같은 객체를 참조하고 있으므로, 동일한 값 출력
        System.out.println(s3.modelName); // super자바폰1
        System.out.println(s4.modelName); // super자바폰1
        System.out.println(s5.modelName); // super자바폰1

        changeModelName(s3); // t4, t5, t6가 같은 객체를 참조하고 있으므로, 동일한 값 출력
        System.out.println(s3.modelName); // 오류
        System.out.println(s4.modelName); // 오류
        System.out.println(s5.modelName); // 오류

        // 2-4. 참조 끊기
        s4 = null;
        s5 = null;
        System.out.println(s3.modelName); // 오류
        System.out.println(s4.modelName); // NullPointerException
        System.out.println(s5.modelName); // NullPointerException
    }

    public static void changeModelName(SuperA s) {
        s.modelName = "오류";
    }
}
