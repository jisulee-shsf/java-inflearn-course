package chap_09.order;

public class OrderByAnyType<T> {
    public T t;

    public OrderByAnyType(T t) {
        this.t = t;
    }

    public void printOrderInfo() {
        System.out.println("주문 정보: " + t);
    }
}