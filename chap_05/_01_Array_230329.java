package chap_05;

public class _01_Array_230329 {
    public static void main(String[] args) {
        // 1. 배열을 사용하지 않은 경우
        String coffee1 = "americano";
        String coffee2 = "latte";
        String coffee3 = "mocha";
        
        System.out.println("A는 " + coffee1 + " 한 잔");
        System.out.println("B는 " + coffee2 + " 한 잔");
        System.out.println("C는 " + coffee3 + " 한 잔");
        System.out.println("주세요.");
        System.out.println("주문 완료 #1");
        /*
        A는 americano 한 잔
        B는 latte 한 잔
        C는 mocha 한 잔
        주세요.
        주문 완료 #1
        */

        // 2. 배열을 사용한 경우
        String[] coffees1 = new String[3];
        coffees1[0] = "americano";
        coffees1[1] = "latte";
        coffees1[2] = "mocha";
        
        String coffees2[] = new String[3];
        coffees2[0] = "americano";
        coffees2[1] = "latte";
        coffees2[2] = "mocha";

        String[] coffees3 = new String[] {"americano", "latte", "mocha"};

        String[] coffees4 = {"americano", "latte", "mocha"};
        
        System.out.println("A는 " + coffees4[0] + " 한 잔");
        System.out.println("B는 " + coffees4[1] + " 한 잔");
        coffees4[2] = "Cappuccino"; // 값 업데이트 
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

        // 3. String 외, 다른 자료형에 배열을 사용한 경우
        int[] test1 = {10, 20, 30};
        System.out.println(test1[0]); // 10

        double[] test2 = {10.0, 20.0, 30.0};
        System.out.println(test2[1]); // 20.0

        boolean[] test3 = {true, true, false};
        System.out.println(test3[2]); // false
    }
}
