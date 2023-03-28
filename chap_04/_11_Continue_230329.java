package chap_04;

public class _11_Continue_230329 {
    public static void main(String[] args) {
        // 1. for문의 continue
        int max = 10; // 한정된 커피 수
        int offer = 0; // 제공된 커피 수
        int noShow = 10; // 노쇼로 커피 제공이 어려운 고객 번호
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "번째 손님, 주문하신 시그니쳐 커피 나왔습니다.");

            if (i == noShow) {
                System.out.println(i + "번째 손님, 노쇼로 다음 손님께 순서가 넘어갑니다.");
                continue;
            }
            offer++;

            if (offer == max) {
                System.out.println("음료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("금일 영업을 종료합니다. #1");
        /*
        1번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        2번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        3번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        ...
        10번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        10번째 손님, 노쇼로 다음 손님께 순서가 넘어갑니다.
        11번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        음료가 모두 소진되었습니다.
        금일 영업을 종료합니다. #1
        */

        // 2-1. while문의 continue
        offer = 0; // 제공된 커피 수
        int index = 1; // 손님 수
        while (index <= 30) {
            System.out.println(index + "번째 손님, 주문하신 시그니쳐 커피 나왔습니다.");

            if (index == noShow) {
                System.out.println(index + "번째 손님, 노쇼로 다음 손님께 순서가 넘어갑니다.");
                index++; // -> 위치 주의
                continue;
            }
            offer++;

            if (offer == max) {
                System.out.println("음료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("금일 영업을 종료합니다. #2");
        /*
        1번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        2번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        3번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        ...
        10번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        10번째 손님, 노쇼로 다음 손님께 순서가 넘어갑니다.
        11번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        음료가 모두 소진되었습니다.
        금일 영업을 종료합니다. #2
        */

        // 2-2. while문의 continue -> true & condition
        offer = 0; // 제공된 커피 수
        index = 0; // 손님 수 -> 0에서 시작
        while (true) { // while (index < 50) -> 0부터 49까지 총 50명 유지
            index++; // -> 시작과 함께 손님 수 카운팅
            System.out.println(index + "번째 손님, 주문하신 시그니쳐 커피 나왔습니다.");

            if (index == noShow) {
                System.out.println(index + "번째 손님, 노쇼로 다음 손님께 순서가 넘어갑니다.");
                continue;
            }
            offer++;

            if (offer == max) {
                System.out.println("음료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("금일 영업을 종료합니다. #3");
        /*
        1번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        2번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        3번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        ...
        10번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        10번째 손님, 노쇼로 다음 손님께 순서가 넘어갑니다.
        11번째 손님, 주문하신 시그니쳐 커피 나왔습니다.
        음료가 모두 소진되었습니다.
        금일 영업을 종료합니다. #3
        */
    }
}