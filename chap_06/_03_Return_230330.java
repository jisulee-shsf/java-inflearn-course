package chap_06;

public class _03_Return_230330 {
    // 1. 메서드 정의
    public static String getNumber() {
        return "02-0000-0000";
    }
    public static String getAddress() {
        String address = "서울시 중구 000";
        return address;
    }

    public static int getZipCode() {
        int zipCode = 12345;
        return zipCode;
    }

    // 2. 메서드 호출
    public static void main(String[] args) {
        String officeNumber = getNumber();
        System.out.println("사무실 전화번호: " + officeNumber);

        String officeAddress = getAddress();
        System.out.println("사무실 주소: " + officeAddress);

        int officeZipCode = getZipCode();
        System.out.println("사무실 우편번호: " + officeZipCode);
        /*
        사무실 전화번호: 02-0000-0000
        사무실 주소: 서울시 중구 000
        사무실 우편번호: 12345
        */
    }
}