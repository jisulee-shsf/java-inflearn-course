package chap_10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _05_Stream2_230424 {
    public static void main(String[] args) {
        // 1. 스트림 생성
        int[] intArray = {4, 2, 1, 3, 5};
        IntStream intArrayStream = Arrays.stream(intArray);

        // 2. 스트림 사용
        intArrayStream.filter(x -> x >= 3).forEach(x -> System.out.println(x));
        // intArrayStream.filter(x -> x >= 3).forEach(System.out::println);
        /*
        4
        3
        5
        */

        long result1 = Arrays.stream(intArray).filter(x -> x >= 3).count();
        System.out.println(result1); // 3

        int result2 = Arrays.stream(intArray).filter(x -> x >= 3).sum();
        System.out.println(result2); // 12

        Arrays.stream(intArray).filter(x -> x >= 3).sorted().forEach(System.out::println);
        /*
        3
        4
        5
        */
    }
}