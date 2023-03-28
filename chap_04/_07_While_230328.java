package chap_04;

public class _07_While_230328 {
    public static void main(String[] args) {
        // 1-1. while문
        int height = 10;
        int move = 3;
        while (move < height) {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 3;
        }
        System.out.println(move + "로 이동이 종료되었습니다. #1-1");
        /*
        현재 위치는 3입니다.
        현재 위치는 6입니다.
        현재 위치는 9입니다.
        12로 이동이 종료되었습니다. #1-1
        */

        // 1-2. 무한 루프
        move = 0;
        while (move < height) {
            System.out.println("현재 위치는 " + move + "입니다.");
        }
        System.out.println("이동이 종료되었습니다. #1-2");
        /*
        현재 위치는 0입니다.
        현재 위치는 0입니다.
        현재 위치는 0입니다.
        ...
        */

        //2. do/while문
        move = 0;
        int step = 3;
        while (move + step < height) {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 3;
        }
        System.out.println(move + "로 이동이 종료되었습니다. #2-1");
        /*
        현재 위치는 0입니다.
        현재 위치는 3입니다.
        현재 위치는 6입니다.
        9로 이동이 종료되었습니다. #2-1
        */

        move = 0;
        step = 10;
        while (move + step < height) {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 3;
        }
        System.out.println(move + "로 이동이 종료되었습니다. #2-2");
        /*
        0로 이동이 종료되었습니다. #2-2
        */

        do {
            System.out.println("현재 위치는 " + move + "입니다.");
            move += 3;
        } while (move + step < height);
        System.out.println(move + "로 이동이 종료되었습니다. #2-3");
        /*
        현재 위치는 0입니다.
        3로 이동이 종료되었습니다. #2-3
        */
    }
}
