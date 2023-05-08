package chap_03;

public class _01_String1_230327 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s); // I like Java and Python and C.

        // 1. length(): 문자열 길이 반환
        System.out.println(s.length()); // 29

        // 2. contains(): 특정 문자열 포함 여부 반환
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("JAVA")); // false
        System.out.println(s.contains("C#")); // false

        // 3. startsWith() & endsWith(): 특정 문자열로 시작 또는 끝나는지 여부 반환
        System.out.println(s.startsWith("I")); // true
        System.out.println(s.endsWith("C")); // false

        // 4. indexOf(): 특정 문자열의 위치 반환
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1
        System.out.println(s.indexOf("and")); // 12
        System.out.println(s.lastIndexOf("and")); // 23

        // 5. substring(): 특정 범위의 문자열 반환
        System.out.println(s.substring(7)); // Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"))); // Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java and Python and C

        // 6. toUpperCase() & toLowerCase(): 문자열 대소문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND PYTHON AND C.
        System.out.println(s.toLowerCase()); // i like java and python and c.

        // 7. replace(): 문자열 치환
        System.out.println(s.replace("C", "C#")); // I like Java and Python and C#.

        // 8. concat(): 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1.concat(s2)); // JavaPython
        System.out.println(s1 + ", " + s2); // Java, Python
        System.out.println(s1.concat(", ").concat(s2)); // Java, Python

        // 9. trim(): 문자열 공백 제거
        String s3 = "     I like Java.     ";
        System.out.println(s3); //      I like Java.
        System.out.println(s3.trim()); // I like Java.
    }
}