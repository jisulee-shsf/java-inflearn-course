package chap_09.order;

import chap_09.menu.Menu;

public class OrderByUser<T extends Menu> {
    public T menu;

    public OrderByUser(T menu) {
        this.menu = menu;
    }

    public void printOrderInfo() {
        System.out.println("주문 정보: " + menu.menuName);
        menu.orderMenu();
    }
}
