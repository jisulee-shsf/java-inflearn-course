package chap_01;

public class _04_TypeCasting_230325 {
    public static void main(String[] args) {
        // 1-1. 정수 -> 실수 변환
        int i = 80;
        System.out.println((float) i); // 80 -> 80.0
        System.out.println((double) i); // 80 -> 80.0

        // 1-2. 실수 -> 정수 변환
        float f = 80.5F;
        double d = 80.5;
        System.out.println((int) f); // 80.5 -> 80
        System.out.println((int) d); // 80.5 -> 80

        // 1-3. 정수 + 실수 연산
        i = 30 + 50;
        System.out.println(i); // 80
        i = 30 + (int) 50.5;
        System.out.println(i); // 30 + 50.5 -> 30 + 50 = 80

        d = 30 + 50;
        System.out.println(d); // 80.0
        d = 30 + 50.5; // = (double) 30 + 50.5
        System.out.println(d); // 30.0 + 50.5 = 80.5

        // 2-1. 자동 형변환(int -> long -> float -> double)
        double intToDouble = i;
        System.out.println(intToDouble); // 80 -> 80.0

        // 2-2. 수동 형변환(double -> float -> long -> int)
        int doubleToInt = (int) d;
        System.out.println(doubleToInt); // 80.5 -> 80

        // 3-1. 숫자형(정수) -> 문자열 변환
        String s1 = String.valueOf(90);
        System.out.println(s1); // 90 -> "90"

        String s2 = Integer.toString(90);
        System.out.println(s2); // 90 -> "90"

        // 3-2. 숫자형(실수) -> 문자열 변환
        String s3 = String.valueOf(90.5);
        System.out.println(s3); // 90.5 -> "90.5"

        String s4 = Double.toString(90.5);
        System.out.println(s4); // 90.5 -> "90.5"

        // 3-3. 문자열 -> 숫자형(정수) 변환
        i = Integer.parseInt("90");
        System.out.println(i); // "90" -> 90

        // 3-4. 문자열 -> 숫자형(실수) 변환
        d = Double.parseDouble("90.5");
        System.out.println(d); // "90.5" -> 90.5

        // 3-5. 숫자형이 아닌 문자열의 변환
        i = Integer.parseInt("자바");
        System.out.println(i); // error

        d = Double.parseDouble("자바");
        System.out.println(d); // error
    }
}
