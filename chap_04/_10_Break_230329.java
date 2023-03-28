package chap_04;

public class _10_Break_230329 {
    public static void main(String[] args) {
        // 1. for문의 break
        int max = 10;
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "번째 손님, 50% 쿠폰이 제공되었습니다.");
            if (i == max) {
                System.out.println("선착순 쿠폰이 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("이벤트를 종료합니다. #1");
        /*
        1번째 손님, 50% 쿠폰이 제공되었습니다.
        2번째 손님, 50% 쿠폰이 제공되었습니다.
        3번째 손님, 50% 쿠폰이 제공되었습니다.
        ...
        10번째 손님, 50% 쿠폰이 제공되었습니다.
        선착순 쿠폰이 모두 소진되었습니다.
        이벤트를 종료합니다. #1
        */

        // 2. while문의 break
        int index = 1;
        while (index <= 30) {
            System.out.println(index + "번째 손님, 50% 쿠폰이 제공되었습니다.");
            if (index == max) {
                System.out.println("선착순 쿠폰이 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("이벤트를 종료합니다. #2");
        /*
        1번째 손님, 50% 쿠폰이 제공되었습니다.
        2번째 손님, 50% 쿠폰이 제공되었습니다.
        3번째 손님, 50% 쿠폰이 제공되었습니다.
        ...
        10번째 손님, 50% 쿠폰이 제공되었습니다.
        선착순 쿠폰이 모두 소진되었습니다.
        이벤트를 종료합니다. #2
        */
    }
}