package chap_07;

import java.util.Random; // Random 클래스 import 확인

public class _11_Package_230402 {
    public static void main(String[] args) {
        // 1. Random 클래스 객체 생성
        Random r = new Random();

        // 2. Random 클래스 사용 예시
        System.out.println(r.nextInt()); // 1684752253
        System.out.println(r.nextInt(100)); // 0 이상 100 미만의 수 출력 -> 36

        System.out.println(r.nextDouble()); // 0.0 이상 1.0 미만의 수 출력 -> 0.26672064270496887
        System.out.println(r.nextBoolean()); // true

        System.out.println(5.0 + (10.0 - 5.0) * r.nextDouble()); // 5.0 이상 10.0 미만의 수 출력
        System.out.println(r.nextInt((30) + 1)); // 1 이상 31 미만의 수 출력
    }
}