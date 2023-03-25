package chap_01;

public class _03_Naming_230324 {
    public static void main(String[] args) {
        /*
        1. 변수
            1) 저장 값에 어울리는 이름 사용
            2) 한 개 또는 두 개 이상의 단어를 연속해 사용
            3) 소문자로 시작하며, 첫 단어 외 단어의 시작은 대문자 사용
            4) 숫자 외 밑줄(_) 및 문자(abc)로 시작
            5) 공백 외 밑줄(_), 문자(abc), 숫자(123) 사용
            6) 예약어(public, static, ...) 사용 불가
            7) 프로그램 흐름을 위한 변수명은 중요하지 않음
        */
        String nationality = "대한민국";
        String firstName = "길동";
        String lastName = "홍";
        String dateOfBirth = "2000-01-01";
        String residentialAddress = "00 호텔";
        String purposeOfVisit = "교육";
        String flightNo = "KE123";
        String _flightNo = "KE123";
        String flight_No = "KE123";
        
        int i = 10;
        String s = "10";
        String str = "10";

        /* 2. 상수
            1) 예약어 final & 대문자 사용
            2) 두 개 이상의 단어의 경우, 밑줄(_)로 구분
         */
        final String CODE = "KR"; // CODE = "US" 변경 불가
        final String KR_COUNTRY_CODE = "+82";
        System.out.println(KR_COUNTRY_CODE);
        
        final double PI = 3.121592;
        final String DATE_OF_BIRTH = "2000-01-01";
        System.out.println(DATE_OF_BIRTH);
    }
}
