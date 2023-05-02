package chap_13;

public class _02_Output_230503 {
    public static void main(String[] args) {
        // 1. 정수
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d%n", 123); // 123
        System.out.printf("%d%n", 1, 2, 3); // 1
        System.out.printf("%d%d%d%n", 1, 2, 3); // 123
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3

        System.out.printf("%5d%n", 123); // __123
        System.out.printf("%05d%n", 123); // 00123
        System.out.printf("%+5d%n", 123); // _+123
        System.out.printf("%+5d%n", -123); // _-123
        System.out.printf("%5d%n", -123); // _-123

        System.out.printf("%-5d%n", 123); // 123__
        System.out.printf("%-5d%n", 12300); // 12300
        System.out.printf("%-+5d%n", 123); // +123_
        System.out.printf("%-+5d%n", -123); // -123_
        System.out.printf("%-5d%n", -123); // -123_

        System.out.printf("%,10d%n", 1000000);// _1,000,000
        System.out.printf("%-,10d%n", 1000000);// 1,000,000_

        // 2. 실수
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI); // 3.14

        System.out.printf("%6.2f%n", Math.PI); // __3.14
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14
        System.out.printf("%+6.2f%n", -Math.PI); // _-3.14
        System.out.printf("%6.2f%n", -Math.PI); // _-3.14

        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%-+6.2f%n", Math.PI); // +3.14_
        System.out.printf("%-+6.2f%n", -Math.PI); // -3.14_
        System.out.printf("%-6.2f%n", -Math.PI); // -3.14_

        // 3. 문자열
        System.out.printf("%s%n", "string"); // string
        System.out.printf("%.2s%n", "string"); // st

        System.out.printf("%4.2s%n", "string"); // __st
        System.out.printf("%-4.2s%n", "string"); // st__

        // 4. 활용
        System.out.println("str     int   float");
        System.out.printf("%-6s %4d %8.2f%n", "Java1", 123, 123.123123); // Java1_____123___123.12
        System.out.printf("%-6s %4d %8.2f%n", "Java2", 12, 123.12); // Java2____12___123.12
        System.out.printf("%-6s %4d %8.2f%n", "Java3", 1, 123.1); // Java3_____1___123.10
        /*
        str     int   float
        Java1   123   123.12
        Java2    12   123.12
        Java3     1   123.10
        */
    }
}