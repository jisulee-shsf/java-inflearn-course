package chap_07;

public class _01_Class_230401 {
    public static void main(String[] args) {
        // 1. 기존 데이터 및 함수 생성 방식
        String modelName = "자바폰1";
        String modelType = "프로";
        int modelCapacity = 128;
        int modelPrice = 1000000;
        
        String modelName = "자바폰2";
        String modelType = "프로맥스";
        int modelCapacity = 256;
        int modelPrice = 1500000;
        ...   

        // 2. 클래스 객체 생성
        Phone p1 = new Phone(); // Phone 클래스의 p1 객체 생성
        Phone p2 = new Phone(); // Phone 클래스의 p2 객체 생성
    }
}
