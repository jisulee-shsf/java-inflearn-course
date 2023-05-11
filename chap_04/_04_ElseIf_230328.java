package chap_04;

public class _04_ElseIf_230328 {
    public static void main(String[] args) {
        // 1. if-else if문
        boolean caffeLatte = false;
        boolean caffeMocha = false;
        boolean matchaFrappuccino = true;

        if (caffeLatte) { // false
            System.out.println("카페 라떼를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #1");
        } else if (caffeMocha) { // false
            System.out.println("카페 모카를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #2");
        } else if (matchaFrappuccino) { // true
            System.out.println("말차 프라푸치노를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #3");
        } else {
            System.out.println("아메리카노를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #4");
        }
        System.out.println("주문이 완료됐습니다.");
        /*
        말차 프라푸치노를 주문하셨습니다.
        음료를 제조하고 있습니다. #3
        주문이 완료됐습니다.
        */

        // 2. else블럭이 생략된 경우
        caffeLatte = false;
        caffeMocha = false;
        matchaFrappuccino = false;

        if (caffeLatte) { // false
            System.out.println("카페 라떼를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #1");
        } else if (caffeMocha) { // false
            System.out.println("카페 모카를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #2");
        } else if (matchaFrappuccino) { // false
            System.out.println("말차 프라푸치노를 주문하셨습니다.");
            System.out.println("음료를 제조하고 있습니다. #3");
        }
        System.out.println("주문이 완료됐습니다.");
        /*
        주문이 완료됐습니다.
        */
    }
}