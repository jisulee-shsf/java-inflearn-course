package chap_06;

public class _06_MainMethod_230331 {
    public static void main(String[] args) {
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("1. 상품 검색"); // 1
                    break;
                case "2":
                    System.out.println("2. 상품 조회"); // 2
                    break;
                case "3":
                    System.out.println("3. 상품 구매"); // 3
                    break;
                default:
                    System.out.println("잘못된 입력입니다."); // 1~3 외의 경우
            }
        } else {
            System.out.println("1~3번 중 입력해 주세요."); // args의 길이가 1이 아닌 경우
        }
        System.out.println("선택이 완료되었습니다.");
    }
}