package chap_07;

public class _07_This_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();
        p.modelName = "자바폰";
        p.modelType = "프로";

        // 2. 참조변수 this를 사용한 인스턴스 변수 값 변경
        // p.appendModelType("맥스"); // 맥스 += 맥스
        // System.out.println(p.modelType); 맥스
        p.appendModelType("맥스");
        System.out.println(p.modelType); // 프로맥스
    }
}