package chap_11;

public class _06_CustomException_230427 {
    public static void main(String[] args) {
        int code = 1111;
        try {
            if (code != 1234) {
                throw new codeException("코드가 잘못 입력되었습니다.");
            } else {
                System.out.println("프로그램을 실행합니다.");
            }
        } catch (codeException e) {
            System.out.println("오류 확인: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("프로그램을 종료합니다.");
            e.printStackTrace();
        }
        /*
        오류 확인: 코드가 잘못 입력되었습니다.
        */
    }
}

class codeException extends Exception {
    public codeException(String message) {
        super(message);
    }
}