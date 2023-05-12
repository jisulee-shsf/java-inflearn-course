package chap_05;

public class _01_Array_230329 {
    public static void main(String[] args) {
        // 1-1. 배열의 선언 ・ 생성 ・ 초기화
        String[] coffees1 = new String[3];
        coffees1[0] = "americano";
        coffees1[1] = "cafeLatte";
        coffees1[2] = "cafeMocha";
        
        String coffees2[] = new String[3];
        coffees2[0] = "americano";
        coffees2[1] = "cafeLatte";
        coffees2[2] = "cafeMocha";

        String[] coffees3 = new String[] {"americano", "cafeLatte", "cafeMocha"};

        String[] coffees4 = {"americano", "cafeLatte", "cafeMocha"};

        // 1-2. 배열의 출력
        String[] coffees = {"americano", "cafeLatte", "cafeMocha"};

        System.out.println("A는 " + coffees[0] + " 한 잔");
        System.out.println("B는 " + coffees[1] + " 한 잔");
        coffees[2] = "cappuccino"; // 값 업데이트
        System.out.println("C는 " + coffees[2] + " 한 잔");
        System.out.println("주세요.");
        /*
        A는 americano 한 잔
        B는 cafeLatte 한 잔
        C는 cappuccino 한 잔
        주세요.
        */

        // 2. 타입별 배열
        int[] test1 = {10, 20, 30};
        System.out.println(test1[0]); // 10

        double[] test2 = {10.0, 20.0, 30.0};
        System.out.println(test2[1]); // 20.0

        boolean[] test3 = {true, true, false};
        System.out.println(test3[2]); // false
    }
}