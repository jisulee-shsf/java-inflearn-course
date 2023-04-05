package chap_07;

public class _07_This_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 인스턴스 변숫값 설정
        p.modelType = "프로";

        // 3-1. 지역 변수 += 지역 변수) 메서드 호출
        p.appendModelType("맥스");
        System.out.println(p.modelType); // 맥스

        // 3-2. 인스턴스 변수 += 지역 변수) 메서드 호출
        p.appendModelType("맥스");
        System.out.println(p.modelType); // 프로맥스
    }
}

/*
// 참조 변수 this
public class Phone {
    // 메서드 정의
    void appendModelType(String modelType) {
        // modelType += modelType; 지역 변수 += 지역 변수
        this.modelType += modelType; // 인스턴스 변수 += 지역 변수
    }
}
*/
