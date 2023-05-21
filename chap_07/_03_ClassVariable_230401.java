package chap_07;

public class _03_ClassVariable_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성 전, 클래스 변수의 값 출력
        System.out.println(Phone3.canCrashDetection); // true

        // 2. 클래스 객체 생성 후, 클래스 변수 출력
        Phone3 p1 = new Phone3();
        Phone3 p2 = new Phone3();

        System.out.println(p1.canCrashDetection); // true
        System.out.println(p2.canCrashDetection); // true
        System.out.println(Phone3.canCrashDetection); // true

        // 3. 클래스 변수 변경 후 출력 -> 객체 전체에 변경 사항 적용 확인
        Phone3.canCrashDetection = false;
        System.out.println(p1.canCrashDetection); // false
        System.out.println(p2.canCrashDetection); // false
        System.out.println(Phone3.canCrashDetection); // false
    }
}

class Phone3 {
    static boolean canCrashDetection = true;
}