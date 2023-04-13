package chap_09;

import chap_09.menu.*;
import chap_09.order.*;

public class _02_GenericClass_230412 {
    public static void main(String[] args) {
        // 1. 기존 클래스
        OrderByNumber trackByNumber = new OrderByNumber(123);
        trackByNumber.printOrderInfo();
        OrderByName trackByName = new OrderByName("홍길동1");
        trackByName.printOrderInfo();
        /*
        주문 정보: 123
        주문 정보: 홍길동1
        */

        // 2. 제네릭 클래스
        Order tracking1 = new Order<>(345);
        tracking1.printOrderInfo();
        Order tracking2 = new Order<>("홍길동2");
        tracking2.printOrderInfo();
        /*
        주문 정보: 345
        주문 정보: 홍길동2
        */

        OrderByUser<Menu> orderByUser1 = new OrderByUser<>(new Menu("까르보나라"));
        orderByUser1.printOrderInfo();
        /*
        주문 정보: 까르보나라
        까르보나라 주문이 입력됐습니다.
        */

        OrderByUser<Menu> orderByUser2 = new OrderByUser<>(new SpecialMenu("안심 스테이크"));
        // OrderByUser<SpecialMenu> orderByUser2 = new OrderByUser<>(new SpecialMenu("스테이크"));
        orderByUser2.printOrderInfo();
        /*
        주문 정보: 스페셜 메뉴 스테이크
        스페셜 메뉴 스테이크 주문이 입력됐습니다.
        */
    }
}