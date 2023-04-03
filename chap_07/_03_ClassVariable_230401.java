package chap_07;

public class _03_ClassVariable_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 인스턴스 변수 값 설정
        p.modelName = "자바폰";
        System.out.println(p.modelName); // 자바폰

        // 3. 클래스 변수 사용
        System.out.println(p.canCrashDetection); // 객체 -> false
        System.out.println(Phone.canCrashDetection); // 인스턴스 전체 -> false

        // 4. 클래스 변수 값 변경
        Phone.canCrashDetection = true;
        System.out.println(p.canCrashDetection); // 객체 -> true
        System.out.println(Phone.canCrashDetection); // 인스턴스 전체 -> true
    }
}

/*
// 클래스 변수 선언(static)
public class Phone {
    static boolean canCrashDetection = false;
}
*/