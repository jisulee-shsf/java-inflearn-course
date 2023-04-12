package chap_09.tracking;

public class TrackByName {
    public String customerName;

    public TrackByName(String customerName) {
        this.customerName = customerName;
    }

    public void track() {
        System.out.println("주문 정보: " + customerName + "(금일 배송 예정)");
    }
}
