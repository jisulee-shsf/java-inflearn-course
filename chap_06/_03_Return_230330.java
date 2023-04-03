package chap_06;

public class _03_Return_230330 {
    // 1. 메서드 정의
    public static String getAddress() {
        String address = "서울시 중구 000";
        return address;
    }

    public static int getZipCode() {
        int zipCode = 12345;
        return zipCode;
    }

    public static String getNumber() {
        return "02-0000-0000";
    }

    // 2. 메서드 호출
    public static void main(String[] args) {
        String officeAddress = getAddress(); // 반환값을 저장하기 위한 변수 정의
        System.out.println("사무실 주소: " + officeAddress); // 사무실 주소: 서울시 중구 000

        int officeZipCode = getZipCode(); // 반환값을 저장하기 위한 변수 정의
        System.out.println("사무실 우편번호: " + officeZipCode); // 사무실 우편번호: 12345

        System.out.println("사무실 전화번호: " + getNumber()); // 사무실 전화번호: 02-0000-0000
    }
}
