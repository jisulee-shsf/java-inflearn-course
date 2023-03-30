package chap_05;

public class _02_ArrayLoop_230329 {
    public static void main(String[] args) {
        // 1. array 순회하지 않은 경우
        String[] coffees = {"americano", "latte", "mocha"};
        System.out.println(coffees[0] + " 한 잔");
        System.out.println(coffees[1] + " 한 잔");
        System.out.println(coffees[2] + " 한 잔");
        System.out.println("주세요. #1");
        /*
        americano 한 잔
        latte 한 잔
        mocha 한 잔
        주세요. #1
        */
        
        // 2-1. for문으로 배열을 순회하는 경우
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 한 잔");
        }
        System.out.println("주세요. #2");
        /*
        americano 한 잔
        latte 한 잔
        mocha 한 잔
        주세요. #2
        */

        // 2-2. for-each문으로 배열을 순회하는 경우
        for (String coffee : coffees) {
            System.out.println(coffee + " 한 잔");
        }
        System.out.println("주세요. #3");
        /*
        americano 한 잔
        latte 한 잔
        mocha 한 잔
        주세요. #3
        */
    }
}
