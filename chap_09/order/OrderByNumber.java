package chap_09.order;

public class OrderByNumber {
    public int orderNumber;

    public OrderByNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void printOrderInfo() {
        System.out.println("주문 정보: " + orderNumber);
    }
}
