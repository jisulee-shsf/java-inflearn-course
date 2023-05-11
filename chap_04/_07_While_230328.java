package chap_04;

public class _07_While_230328 {
    public static void main(String[] args) {
        // 1. while문
        int distance = 10;
        int move = 2;

        while (move < distance) {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 2;
        }
        System.out.println("이동을 종료합니다. #1-1");
        /*
        현재 위치는 2입니다.
        현재 위치는 4입니다.
        현재 위치는 6입니다.
        현재 위치는 8입니다.
        이동을 종료합니다. #1-1
        */

        move = 0;

        while (move < distance) {
            System.out.println("현재 위치는 " + move + "입니다.");
        }
        System.out.println("이동을 종료합니다. #1-2");
        /*
        현재 위치는 0입니다.
        현재 위치는 0입니다.
        현재 위치는 0입니다.
        ...
        */

        // 2. do-while문
        move = 10;

        while (move < distance) {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 2;
        }
        System.out.println("이동을 종료합니다. #2-1");
        /*
        이동이 종료되었습니다. #2-1
        */

        do {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 2;
        } while (move < distance);
        System.out.println("이동을 종료합니다. #2-2");
        /*
        현재 위치는 10입니다.
        이동을 종료합니다. #2-2
        */
    }
}