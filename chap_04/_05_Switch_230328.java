package chap_04;

public class _05_Switch_230328 {
    public static void main(String[] args) {
        int ranking = 2;
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
        2위 입상자는 100만원의 장학금을 수여받습니다.
        장학금 안내를 종료합니다. #1
        */

        // 2. switch문
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
    }
}
