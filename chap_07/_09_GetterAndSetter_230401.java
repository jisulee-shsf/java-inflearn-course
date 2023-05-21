package chap_07;

public class _09_GetterAndSetter_230401 {
    public static void main(String[] args) {
        // 1. 클래스 객체 생성
        Phone9 p = new Phone9();

        // 2-1. setter) 메서드 호출
        p.setModelName("자바폰");
        // p.setModelType("프로맥스"); 인스턴스 변수 값 누락 가정
        p.setModelCapacity(120); // 용량 정보 오기입 가정

        // 2-2. getter) 메서드 호출
        System.out.println("모델명: " + p.getModelName());
        System.out.println("모델 타입: " + p.getModelType());
        System.out.println("모델 용량: " + p.getModelCapacity());
        /*
        모델명: 자바폰
        모델 타입: 오류가 발생했습니다. -> 누락된 값의 결과
        모델 용량: 128 -> 오기입된 값의 결과
        */
    }
}

class Phone9 {
    private String modelName;
    private String modelType;
    private int modelCapacity;

    // 1. modelName) getter & setter 메서드 정의
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // 2. modelType) getter & setter 메서드 정의
    public String getModelType() {
        if (modelType == null || modelType.isEmpty()) {
            return "오류가 발생했습니다.";
        }
        return modelType;
    }
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
    
    // 3. modelCapacity) getter & setter 메서드 정의
    public int getModelCapacity() {
        return modelCapacity;
    }

    public void setModelCapacity(int modelCapacity) {
        if (modelCapacity < 128) {
            this.modelCapacity = 128;
        } else {
            this.modelCapacity = modelCapacity;
        }
    }
}