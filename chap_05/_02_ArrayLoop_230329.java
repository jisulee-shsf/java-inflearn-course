package chap_05;

public class _02_ArrayLoop_230329 {
    public static void main(String[] args) {
        // 1. array 순회를 하지 않은 경우
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
        
        // 2. array 순회를 하는 경우 -> 인덱스 값을 활용한 작업이 필요한 경우
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

        // 3. for-each문 -> array의 모든 요소를 순회하며 작업하는 경우
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
