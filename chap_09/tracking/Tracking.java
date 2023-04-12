package chap_09.tracking;

// 제네릭 클래스
public class Tracking <T>{
    public T t;

    public Tracking(T t) {
        this.t = t;
    }

    public void track() {
        System.out.println("주문 정보: " + t + "(금일 배송 예정)");
    }
}
