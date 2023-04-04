package chap_07;

public class _03_ClassVariable_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 클래스 변수 출력
        System.out.println(p.canCrashDetection); // 객체 -> false
        System.out.println(Phone.canCrashDetection); // 전체 -> false

        // 3. 클래스 변수 값 변경 후 출력
        Phone.canCrashDetection = true;
        System.out.println(p.canCrashDetection); //  객체 -> true
        System.out.println(Phone.canCrashDetection); // 전체 -> true
    }
}

/*
// 클래스 변수(static)
public class Phone {
    static boolean canCrashDetection = false;
}
*/
