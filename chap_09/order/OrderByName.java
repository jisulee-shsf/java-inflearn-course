package chap_09.order;

public class OrderByName {
    public String orderName;

    public OrderByName(String orderName) {
        this.orderName = orderName;
    }

    public void printOrderInfo() {
        System.out.println("주문 정보: " + orderName);
    }
}