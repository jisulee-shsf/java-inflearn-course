package chap_04;

public class _05_Switch_230328 {
    public static void main(String[] args) {
        int ranking = 1;
        int scholarship = 100;

        // 1. if-else if문
        if (ranking == 1) {
            System.out.println(ranking + "위 입상자는 " + (scholarship += 200) + "만원의 장학금을 수여받습니다.");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println(ranking + "위 입상자는 " + scholarship + "만원의 장학금을 수여받습니다.");
        } else {
            System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("장학금 안내를 종료합니다. #1");
        /*
        1위 입상자는 300만원의 장학금을 수여받습니다.
        장학금 안내를 종료합니다. #1
        */

        // 2. switch문
        ranking = 2;
        scholarship = 100;

        switch (ranking) {
            case 1:
                System.out.println(ranking + "위 입상자는 " + (scholarship += 200) + "만원의 장학금을 수여받습니다.");
                break;
            case 2:
            case 3:
                System.out.println(ranking + "위 입상자는 " + scholarship + "만원의 장학금을 수여받습니다.");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("장학금 안내를 종료합니다. #2");
        /*
        2위 입상자는 100만원의 장학금을 수여받습니다.
        장학금 안내를 종료합니다. #2
        */

        // 3. break 여부에 따른 비용 변화 확인
        ranking = 3;
        scholarship = 100;

        switch (ranking) {
            case 1:
                scholarship += 100;
            case 2:
            case 3:
                scholarship += 100;
                System.out.println(ranking + ": " + scholarship + "만원");
        }
        System.out.println("장학금 계산을 종료합니다. #3");
        /*
        ranking 1)
        300만원
        장학금 계산을 종료합니다. #3

        ranking 2 & 3)
        200만원
        장학금 계산을 종료합니다. #3
        */
    }
}