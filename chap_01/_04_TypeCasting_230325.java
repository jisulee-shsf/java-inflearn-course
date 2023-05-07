package chap_01;

public class _04_TypeCasting_230325 {
    public static void main(String[] args) {
        // 1. 형변환
        // 1) int -> float, double
        int i = 80;
        System.out.println((float) i); // 80 -> 80.0
        System.out.println((double) i); // 80 -> 80.0

        // 2) float, double -> int
        float f = 80.5f;
        double d = 80.5;
        System.out.println((int) f); // 80.5 -> 80
        System.out.println((int) d); // 80.5 -> 80

        // 3) int + float, double
        i = 30 + (int) 50.5; // = 30 + 50
        d = 30 + 50.5; // = (double) 30 + 50.5 = 30.0 + 50.5
        System.out.println(i); // 80
        System.out.println(d); // 80.5

        // 4) int -> String
        String s1 = String.valueOf(90); // 90 -> "90"
        String s2 = Integer.toString(90); // 90 -> "90"
        System.out.println(s1); // 90
        System.out.println(s2); // 90

        // 5) double -> String
        String s3 = String.valueOf(90.5); // 90.5 -> "90.5"
        String s4 = Double.toString(90.5); // 90.5 -> "90.5"
        System.out.println(s3); // 90.5
        System.out.println(s4); // 90.5

        // 6) String -> int, double
        i = Integer.parseInt("90"); // "90" -> 90
        d = Double.parseDouble("90.5"); // "90.5" -> 90.5
        System.out.println(i); // 90
        System.out.println(d); // 90.5
        /*
        i = Integer.parseInt("자바");
        d = Double.parseDouble("자바");
        System.out.println(i); // error
        System.out.println(d); // error
        */

        // 2. 자동 형변환 & 수동 형변환
        // 1) 자동 형변환(int -> long -> float -> double)
        i = 80;
        double intToDouble = i; // i = 80 -> 80.0
        System.out.println(intToDouble); // 80.0

        // 2) 수동 형변환(double -> float -> long -> int)
        d = 80.5;
        int doubleToInt = (int) d; // d = 80.5 -> 80
        System.out.println(doubleToInt); // 80
    }
}