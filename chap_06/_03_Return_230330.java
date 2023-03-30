package chap_06;

public class _03_Return_230330 {

    // 1-1. 사무실 주소 메소드
    public static String getAddress() {
        String address = "서울시 중구 000";
        return address;
    }

    // 1-2. 사무실 우편번호 메소드
    public static int getZipCode() {
        int zipCode = 12345;
        return zipCode;
    }

    // 1-3. 사무실 전화번호 메소드
    public static String getNumber() {
        return "02-0000-0000";
    }

    public static void main(String[] args) {
        // 2-1. 사무실 주소 리턴값
        String officeAddress = getAddress();
        System.out.println("사무실 주소: " + officeAddress); // 사무실 주소: 서울시 중구 000

        // 2-2. 사무실 우편번호 리턴값
        int officeZipCode = getZipCode();
        System.out.println("사무실 우편번호: " + officeZipCode); // 사무실 우편번호: 12345

        // 2-3. 사무실 전화번호 리턴값
        System.out.println("사무실 전화번호: " + getNumber()); // 사무실 전화번호: 서울시 중구 000
    }
}