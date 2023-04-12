package chap_09.tracking;

public class TrackByNumber {
    public int orderNumber;

    public TrackByNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void track() {
        System.out.println("주문 정보: " + orderNumber + "(금일 배송 예정)");
    }
}
