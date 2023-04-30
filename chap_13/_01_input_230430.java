package chap_13;

import java.util.Scanner;

public class _01_input_230430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("인바디 사용자 등록을 시작합니다.");

        System.out.println("고객님의 이름을 입력해 주세요.");
        String name = scanner.next();

        System.out.println("고객님의 나이를 입력해 주세요.");
        // int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.next());

        System.out.println("고객님의 키를 입력해 주세요.");
        // double height = scanner.nextDouble();
        double height = Double.parseDouble(scanner.next());

        System.out.println("운동을 시작한 계기를 입력해 주세요.");
        String reason = scanner.next();
        scanner.nextLine();

        System.out.println("선호하는 운동을 입력해 주세요.");
        String workout = scanner.nextLine();
        /*
        인바디 사용자 등록을 시작합니다.
        고객님의 이름을 입력해 주세요.
        자바님
        고객님의 나이를 입력해 주세요.
        12
        고객님의 키를 입력해 주세요.
        123.123
        운동을 시작한 계기를 입력해 주세요.
        근육증가 목적
        선호하는 운동을 입력해 주세요.
        헬스 또는 필라테스
        */

        System.out.println("인바디에 등록된 사용자 정보는 아래와 같습니다.");
        System.out.println("고객 이름: " + name);
        System.out.println("고객 나이: " + age);
        System.out.println("고객 키: " + height);
        System.out.println("운동 계기: " + reason);
        System.out.println("선호 운동 종류: " + workout);
        /*
        인바디에 등록된 사용자 정보는 아래와 같습니다.
        고객 이름: 자바님
        고객 나이: 12
        고객 키: 123.123
        운동 계기: 근육증가
        선호 운동 종류: 헬스 또는 필라테스
        */
    }
}