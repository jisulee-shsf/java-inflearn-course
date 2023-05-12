package chap_05;

public class _02_ArrayLoop_230329 {
    public static void main(String[] args) {
        // 1. for문을 사용한 배열의 순회
        String[] coffees = {"americano", "cafeLatte", "cafeMocha"};

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 한 잔");
        }
        System.out.println("주세요. #1");
        /*
        americano 한 잔
        cafeLatte 한 잔
        cafeMocha 한 잔
        주세요. #1
        */

        // 2. for-each문을 사용한 배열의 순회
        for (String coffee : coffees) {
            System.out.println(coffee + " 한 잔");
        }
        System.out.println("주세요. #2");
        /*
        americano 한 잔
        cafeLatte 한 잔
        cafeMocha 한 잔
        주세요. #2
        */
    }
}