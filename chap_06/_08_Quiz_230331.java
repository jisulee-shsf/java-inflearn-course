package chap_06;

/*
개인정보 일부를 비공개(*)로 전환하는 프로그램 작성

설명)
하나의 메서드를 정의해 모든 동작 처리

예시)
이름: 2번째 글자부터 비공개(나'코딩')
주민등록번호: 9번째 글자부터 비공개(901231-1'234567')
전화번호: 10번째 글자부터 비공개(010-1234-'5678')
*/

public class _08_Quiz_230331 {
    public static String getHiddenData(String info, int index) {
        String hiddenData = info.substring(0, index); // 공개 영역
        for (int i = 0; i < info.length() - index; i++) { // 비공개 영역
        // for (int i = index; i < info.length(); i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        System.out.println("이름: " + getHiddenData("나코딩", 1));
        System.out.println("주민등록번호: " + getHiddenData("901231-1234567", 8));
        System.out.println("전화번호: " + getHiddenData("010-1234-5678", 9));
    }
    /*
    이름: 나**
    주민등록번호: 901231-1******
    전화번호: 010-1234-****
    */
}