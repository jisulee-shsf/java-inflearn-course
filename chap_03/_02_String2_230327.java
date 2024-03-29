package chap_03;

public class _02_String2_230327 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        // 1. equals(): 문자열 내용이 동일한지 비교 / equalsIgnoreCase(): 문자열 내용이 대소문자 관계없이 동일한지 비교
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s1.equals("java")); // false
        System.out.println(s1.equalsIgnoreCase("java")); // true

        // 2. equals(): 내용이 동일한지 비교 / ==: 참조가 동일한지 비교
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); // true

        s3 = new String ("Java");
        s4 = new String ("Java");
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); // false
    }
}