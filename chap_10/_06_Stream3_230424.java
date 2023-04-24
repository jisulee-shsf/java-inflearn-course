package chap_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class _06_Stream3_230424 {
    public static void main(String[] args) {
        // 1. 스트림 생성
        String[] stringArray = {"A+", "A-", "None2", "B+", "B-", "C-", "D-", "None1"};
        Stream<String> stringArrayStream = Arrays.stream(stringArray);

        List<String> stringList = Arrays.asList("A+", "A-", "None2", "B+", "B-", "C-", "D-", "None1");
        Stream<String> stringListStream = stringList.stream();

        // 2. 스트림 사용
        stringArrayStream.filter(x -> x.startsWith("A")).forEach(System.out::println);
        /*
        A+
        A-
        */

        Arrays.stream(stringArray).filter(x -> x.contains("+")).forEach(System.out::println);
        /*
        A+
        B+
        */

        Arrays.stream(stringArray).filter(x -> x.length() >= 3).sorted().forEach(System.out::println);
        /*
        None1
        None2
        */

        Arrays.stream(stringArray).filter(x -> x.length() <= 3).filter(x -> x.contains("-")).sorted().forEach(System.out::println);
        /*
        A-
        B-
        C-
        D-
        */

        boolean result1 = stringListStream.filter(x -> x.length() <= 3).anyMatch(x -> x.contains("+"));
        System.out.println(result1); // true

        boolean result2 = stringList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("-"));
        System.out.println(result2); // false

        stringList.stream()
                  .filter(x -> x.length() >= 3)
                  .filter(x -> x.contains("N"))
                  .map(x -> x + "(성적 미달)")
                  .sorted()
                  .forEach(System.out::println);
        /*
        None1(성적 미달)
        None2(성적 미달)
        */

        stringList.stream()
                  .filter(x -> x.contains("N"))
                  .map(String::toLowerCase)
                  .sorted()
                  .forEach(System.out::println);
        /*
        none1
        none2
        */

        List<String> resultList = stringList.stream()
                                            .filter(x -> x.contains("N"))
                                            .map(String::toLowerCase)
                                            .sorted()
                                            .collect(Collectors.toList());
        resultList.stream().forEach(System.out::println);
        /*
        none1
        none2
        */
    }
}