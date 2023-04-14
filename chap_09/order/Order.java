package chap_09.order;

// 제네릭 클래스
public class Order<T> {
    public T t;

    public Order(T t) {
        this.t = t;
    }

    public void printOrderInfo() {
        System.out.println("주문 정보: " + t);
    }
}