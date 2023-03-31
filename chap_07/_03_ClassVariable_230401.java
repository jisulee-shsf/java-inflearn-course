package chap_07;

public class _03_ClassVariable_230401 {
    public static void main(String[] args) {
        // 1. 클래스 변수 사용
        Phone p = new Phone();
        p.modelName = "자바폰";
        System.out.println(p.modelName); // 자바폰
        // System.out.println(p.canCrashDetection); // false
        System.out.println(Phone.canCrashDetection); // false

        // 2. 클래스 변수 값 변경
        Phone.canCrashDetection = true;
        // System.out.println(p.canCrashDetection); // true
        System.out.println(Phone.canCrashDetection); // true
    }
}
