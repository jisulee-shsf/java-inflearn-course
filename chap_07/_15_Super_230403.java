package chap_07;

import chap_07.Classes.SuperB;
import chap_07.Classes.SuperC;

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

        // 2-2. 참조 변수 super) 메서드 호출
        s2.feature2();
        s3.feature3();
        /*
        자바폰1: 참조 변수 super를 사용한 feature1입니다.
        자바폰2: feature2입니다.
        자바폰1: 참조 변수 super를 사용한 feature1입니다.
        자바폰3: feature3입니다.
        */

        // 3-1. 생성자 super) 메서드 호출
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