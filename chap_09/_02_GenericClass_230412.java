package chap_09;

import chap_09.tracking.*;

public class _02_GenericClass_230412 {
    public static void main(String[] args) {
        // 1. 기존 클래스
        TrackByNumber trackByNumber = new TrackByNumber(123);
        trackByNumber.track();
        TrackByName trackByName = new TrackByName("홍길동1");
        trackByName.track();
        /*
        주문 정보: 123(금일 배송 예정)
        주문 정보: 홍길동1(금일 배송 예정)
        */

        // 2. 제네릭 클래스
        Tracking tracking1 = new Tracking<>(345);
        tracking1.track();

        Tracking tracking2 = new Tracking<>("홍길동2");
        tracking2.track();
        /*
        주문 정보: 345(금일 배송 예정)
        주문 정보: 홍길동2(금일 배송 예정)
        */
    }
}