package chap_09;

import chap_09.menu.*;
import chap_09.order.*;

public class _02_GenericClass_230412 {
    public static void main(String[] args) {
        // 제네릭 클래스
        OrderByNumber orderByNumber = new OrderByNumber(123);
        orderByNumber.printOrderInfo();

        OrderByName orderByName = new OrderByName("홍길동1");
        orderByName.printOrderInfo();
        /*
        주문 정보: 123
        주문 정보: 홍길동1
        */

        OrderByAnyType orderByAnyType1 = new OrderByAnyType<>(345);
        orderByAnyType1.printOrderInfo();

        OrderByAnyType orderByAnyType2 = new OrderByAnyType<>("홍길동2");
        orderByAnyType2.printOrderInfo();
        /*
        주문 정보: 345
        주문 정보: 홍길동2
        */

        // Menu menu = new Menu("까르보나라"); -> Menu 클래스로부터 menu 객체 생성
        // OrderByUser<Menu> orderByUser1 = new OrderByUser<>(menu); -> OrderByUser 생성자 인자로 전달
        OrderByUser<Menu> orderByUser1 = new OrderByUser<>(new Menu("까르보나라"));
        orderByUser1.printOrderInfo();

        OrderByUser<Menu> orderByUser2 = new OrderByUser<>(new SpecialMenu("안심 스테이크"));
        // OrderByUser<SpecialMenu> orderByUser2 = new OrderByUser<>(new SpecialMenu("안심 스테이크"));
        orderByUser2.printOrderInfo();
        /*
        주문 정보: 까르보나라
        까르보나라 주문이 입력됐습니다.

        주문 정보: 스페셜 메뉴 안심 스테이크
        스페셜 메뉴 안심 스테이크 주문이 입력됐습니다.
        */
    }
}