package chap_10;

import chap_10.detecter.*;

public class _03_FunctionalInterface_230424 {
    public static void main(String[] args) {
        // 1. 매개변수가 없는 경우
        Detectable0 d0 = () -> System.out.println("오류가 감지되었습니다.");
        d0.detect(); // 오류가 감지되었습니다.

        // 2. 매개변수가 1개인 경우
        Detectable1 d1 = (count) -> System.out.println(count + "번의 오류가 감지되었습니다.");
        d1.detect(3); // 3번의 오류가 감지되었습니다.

        // 3. 매개변수가 2개인 경우
        /*
        Detectable2 d2 = (c, h) -> System.out.println(c + "번의 오류가 " + h + "시간째 반복되는 점을 감지했습니다.");
        d2.detect(3, 5); // 3번의 오류가 5시간째 반복되는 점을 감지했습니다.
        */

        Detectable2 d2 = (c, h) -> {
            int result1 = c;
            int result2 = h;
            System.out.println(result1 + "번의 오류가 " + result2 + "시간째 반복되는 점을 감지했습니다.");
        };
        d2.detect(3,5); // 3번의 오류가 5시간째 반복되는 점을 감지했습니다.

        // 4. 반환값이 있는 경우
        Detectable3 d3 = (c, h) -> c * h; // {return(c * h);};
        int result = d3.detect(3, 5);
        System.out.println("총 오류 발생 시간: " + result); // 총 오류 발생 시간: 15
    }
}