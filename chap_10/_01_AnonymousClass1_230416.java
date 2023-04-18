package chap_10;

public class _01_AnonymousClass1_230416 {
    public static void main(String[] args) {
        // 1. 기존
        Shop s1 = new Shop();
        s1.order("운동화");
        s1.offer();
        /*
        운동화 주문이 완료되었습니다.
        상품 구매에 따라 3% 적립이 완료되었습니다.
        */

        // 2. 익명 클래스
        Shop s2 = new Shop() {
            @Override
            public void order(String s) {
                super.order("VIP 고객님, " + s);
            }

            @Override
            public void offer() {
                System.out.println("VIP 등급에 따라 10% 적립이 완료되었습니다.");
            }
        };

        s2.order("운동화");
        s2.offer();
        /*
        VIP 고객님, 운동화 주문이 완료되었습니다.
        VIP 등급에 따라 10% 적립이 완료되었습니다.
        */
    }
}

class Shop {
    public void order(String s) {
        System.out.println(s + " 주문이 완료되었습니다.");
    }

    public void offer() {
        System.out.println("상품 구매에 따라 3% 적립이 완료되었습니다.");
    }
}
