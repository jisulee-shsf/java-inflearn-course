package chap_09;

public class _03_WapperClass_230413 {
    public static void main(String[] args) {
        // 1. 기본형
        int i1 = 1;
        double d1 = 1.0;
        System.out.println(i1); // 1
        System.out.println(d1); // 1.0

        // 2. 래퍼 클래스
        Integer i2 = 1;
        Double d2 = 1.0;
        System.out.println(i1); // 1
        System.out.println(d1); // 1.0

        String s = Integer.toString(1);
        System.out.println(s); // 1

        int i3 = d2.intValue();
        System.out.println(i3); // 1
    }
}