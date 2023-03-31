package chap_04;

public class _04_ElseIf_230328 {
    public static void main(String[] args) {
        // if-else if문
        boolean latte = false;
        boolean mocha = true;
        if (latte) { // false -> else if문 이동
            System.out.println("latte를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #1");
        } else if (mocha) { // true -> 수행
            System.out.println("mocha를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #2");
        } else {
            System.out.println("latte와 mocha가 모두 소진되어 americano를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #3");
        }
        System.out.println("주문하신 음료 나왔습니다.");
        /*
        mocha를 주문하셨습니다.
        음료를 제조하고 있습니다. #2
        주문하신 음료 나왔습니다.
        */
    }
}
