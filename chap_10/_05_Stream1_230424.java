package chap_10;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class _05_Stream1_230424 {
    public static void main(String[] args) {
        // 1. Collection.stream()
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intListStream = intList.stream();

        List<String> stringList = Arrays.asList("A", "B", "C", "D", "E");
        Stream<String> stringListStream = stringList.stream();

        // 2. Arrays.stream()
        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intArrayStream = Arrays.stream(intArray);

        String[] stringArray = {"A", "B", "C", "D", "E"};
        Stream<String> stringArrayStream = Arrays.stream(stringArray);

        // 3. Stream.of()
        Stream<String> streamOfStream = Stream.of("A", "B", "C", "D", "E");
    }
}