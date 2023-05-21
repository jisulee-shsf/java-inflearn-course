package chap_07;

public class _07_This_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone7 p = new Phone7();

        // 2. 인스턴스 변수에 값 저장
        p.modelType = "프로";

        // 3. 메서드 호출
        p.appendModelType("맥스");
        System.out.println(p.modelType); // 프로 -> 프로맥스
    }
}

class Phone7 {
    String modelType;

    void appendModelType(String modelType) {
        this.modelType += modelType; // 인스턴스 변수 += 지역 변수
    }
}