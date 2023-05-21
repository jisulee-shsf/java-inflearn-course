package chap_07;

public class _01_Class_230401 {
    public static void main(String[] args) {
        // 1. 기존 데이터 처리
        String modelName1 = "자바폰1";
        String modelType1 = "프로";
        int modelCapacity1 = 128;
        int modelPrice1 = 1000000;
        
        String modelName2 = "자바폰2";
        String modelType2 = "프로맥스";
        int modelCapacity2 = 256;
        int modelPrice2 = 1500000;
        // ...

        // 2. 클래스 객체 생성
        Phone1 p1 = new Phone1(); // Phone1 클래스의 p1 객체 생성
        Phone1 p2 = new Phone1(); // Phone1 클래스의 p2 객체 생성
    }
}

class Phone1 {
}