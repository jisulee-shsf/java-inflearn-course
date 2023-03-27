package chap_03;

// Q. 주민등록번호에서 생년월일과 성별까지만 출력하는 프로그램 작성하기

public class _04_Quiz_230327 {
    public static void main(String[] args) {
        String s = "901231-1234567";
        System.out.println(s.substring(0, 8)); // 901231-1
        System.out.println(s.substring(0, s.indexOf("-") + 2)); // 901231-1
    }
}