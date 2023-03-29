package chap_05;

public class _01_Array_230329 {
    public static void main(String[] args) {
        // 1. array를 사용하지 않은 경우
        String coffeA = "americano";
        String coffeB = "latte";
        String coffeC = "mocha";
        System.out.println("A는 " + coffeA + " 한 잔");
        System.out.println("B는 " + coffeB + " 한 잔");
        System.out.println("C는 " + coffeC + " 한 잔");
        System.out.println("주세요.");
        System.out.println("주문 완료 #1");
        /*
        A는 americano 한 잔
        B는 latte 한 잔
        C는 mocha 한 잔
        주세요.
        주문 완료 #1
        */

        // 2-1. array 선언
        String[] coffees1 = new String[3]; // String coffees2[] = new String[3];
        coffees1[0] = "americano"; // A
        coffees1[1] = "latte"; // B
        coffees1[2] = "mocha"; // C

        String[] coffees3 = new String[] {"americano", "latte", "mocha"};

        String[] coffees4 = {"americano", "latte", "mocha"};

        // 2.2. array를 사용한 경우
        System.out.println("A는 " + coffees4[0] + " 한 잔");
        System.out.println("B는 " + coffees4[1] + " 한 잔");
        coffees4[2] = "Cappuccino";
        System.out.println("C는 " + coffees4[2] + " 한 잔");
        System.out.println("주세요.");
        System.out.println("주문 완료 #2");
        /*
        A는 americano 한 잔
        B는 latte 한 잔
        C는 Cappuccino 한 잔
        주세요.
        주문 완료 #2
        */

        // 3. String 외, 다른 자료형에 array를 사용한 경우
        int[] test1 = {10, 20, 30};
        System.out.println(test1[0]); // 10

        double[] test2 = {10.0, 20.0, 30.0};
        System.out.println(test2[1]); // 20.0

        boolean[] test3 = {true, true, false};
        System.out.println(test3[2]); // false
    }
}
