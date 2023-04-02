package chap_07;

import chap_07.Safety.Feature2;
import chap_07.Safety.Feature3;

public class _15_Super_230402 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Feature2 f2 = new Feature2();
        Feature3 f3 = new Feature3();

        // 2. 메서드 오버라이딩
        f2.featureAA();
        f2.featureAAA();
        f3.featureAA();
        f3.featureAAA();

        /*
        안전2: featureAA / 메서드 오버라이딩1
        안전2: featureAAA / super 참조변수
        안전3: featureAA / 메서드 오버라이딩2
        안전3: featureAAA / super 참조변수
        */

        // 3. super 참조변수
        f2.featureAA();
        f3.featureAA();
        /*
        안전2: featureAA / 메서드 오버라이딩1
        안전2: featureAAA / super 참조변수 -> super.featureAAA();
        안전3: featureAA / 메서드 오버라이딩2
        안전3: featureAAA / super 참조변수 -> super.featureAAA();
        */
    }
}