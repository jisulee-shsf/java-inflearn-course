package chap_07;

public class _07_This_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone p = new Phone();

        // 2. 인스턴스 변수 값 설정
        p.modelType = "프로";

        // 3-1. 메서드 호출(modelType += modelType;)
        p.appendModelType("맥스");
        System.out.println(p.modelType); // 맥스

        // 3-2. 메서드 호출(this.modelType += modelType;)
        p.appendModelType("맥스");
        System.out.println(p.modelType); // 프로맥스
    }
}

/*
// 참조변수 this
public class Phone {
    void appendModelType(String modelType) {
        // modelType += modelType; // 매개변수 modelType += 매개변수 modelType -> 맥스 += 맥스
        this.modelType += modelType; // 인스턴스 변수 modelType += 매개변수 modelType -> modelType += 맥스
    }
}
*/