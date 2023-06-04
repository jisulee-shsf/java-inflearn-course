package chap_11;

public class _03_Throw_230426 {
    public static void main(String[] args) {
        try {
            int code = 1111;
            if (code != 1234) {
                throw new Exception("입력하신 코드에 오류가 발생했습니다.");
            } else {
                System.out.println("프로그램을 실행합니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        };
        System.out.println("프로그램 종료");
        /*
        java.lang.Exception: 입력하신 코드에 오류가 발생했습니다.
	        at chap_11._03_Throw_230426.main(_03_Throw_230426.java:8)
        프로그램 종료
        */
    }
}