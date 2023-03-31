package chap_07;

public class _04_Method_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();
        p.modelName = "자바폰";
        System.out.println(p.modelName); // 자바폰

        // 2. 메서드 호출
        int objectCount = p.crashDetection(1);
        System.out.println("충돌이 감지된 물체 개수: " + objectCount + "개"); // 충돌이 감지된 물체 개수: 10개
    }
}
