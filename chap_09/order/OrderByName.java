package chap_09.order;

public class OrderByName {
    public String customerName;

    public OrderByName(String customerName) {
        this.customerName = customerName;
    }

    public void printOrderInfo() {
        System.out.println("주문 정보: " + customerName);
    }
}