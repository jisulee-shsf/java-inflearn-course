package chap_07;

public class Phone {
    // ▶︎ [_02_InstanceVariable_230401] 인스턴스 변수
    // 인스턴스 변수 선언
    String modelName; // 모델명
    String modelType; // 모델 타입
    int modelCapacity; // 모델 용량
    int modelPrice; // 모델 가격

    // ▶︎ [_08_Constructor_230401] 생성자
    // 1. 인스턴스 및 클래스 변수 선언
    int modelNumber; // 모델 번호
    static int modelNumberCounter = 0; // modelNumber 증가

    // 2. 기본 생성자
    Phone() {
        System.out.println("기본 생성자 호출입니다. ");
        this.modelNumber = ++modelNumberCounter;
        System.out.println(this.modelNumber + "번의 모델 번호를 발급했습니다.");
    }

    // 3. 사용자 정의 생성자
    Phone(String modelName, String modelType, int modelCapacity, int modelPrice) {
        this(); // 기본 생성자 호출
        System.out.println("사용자 정의 생성자 호출입니다."); // 인스턴스 변수의 초기화 코드
        this.modelName = modelName;
        this.modelType = modelType;
        this.modelCapacity = modelCapacity;
        this.modelPrice = modelPrice;
    }

    // ▶︎ [_03_ClassVariable_230401] 클래스 변수(static)
    // 클래스 변수 선언
    static boolean canCrashDetection = false;

    // ▶︎ [_04_Method_230401] 메서드
    // 1. 기본 메서드 정의
    void canCrashDetection1() {
        System.out.println("충돌이 감지되었습니다.");
    }
    // 2. 매개 변수가 있는 메서드 정의
    void canCrashDetection2(int number) {
        if (number == 1) {
            System.out.println("충돌이 감지되었습니다.");
        } else {
            System.out.println("충돌이 감지되지 않았습니다.");
        }
    }
    // 3. 매개 변수와 반환값이 있는 메서드 정의
    int canCrashDetection3(int number) {
        if (number == 1) { // 충돌이 감지된 경우
            return 10; // 충돌 감지 물체 개수
        } else { // 이외의 경우
            return 0; // 충돌 감지 물체 없음
        }
    }

    // ▶︎ [_05_Overloading_230401] 오버로딩
    // 1. 메서드1
    void safety(boolean useEmergencySos, boolean useCrashDetection) {
        System.out.println("안전 기능을 시작합니다.");
        if (useEmergencySos) {
            System.out.println("긴급 구조 요청 기능을 시작합니다");
        }
        if (useCrashDetection) {
            System.out.println("충돌 감지 기능을 시작합니다.");
        }
        System.out.println();
    }
    // 2. 메서드2
    void safety() {
        safety(true, true); // 기본값 설정
    }

    // ▶︎ [_06_ClassMethod_230401] 클래스 메서드
    // 클래스 메서드 정의
    static void useSafetyFeatures() {
        System.out.println("안전 기능을 시작합니다.");
        // modelName = "자바자바폰"; 인스턴스 변수 사용 불가 확인
        // canCrashDetection = false; 클래스 변수 사용 가능 확인
    }

    // ▶︎ [_07_This_230401] 참조 변수 this
    // 메서드 정의
    void appendModelType(String modelType) {
        // modelType += modelType; 지역 변수 += 지역 변수
        this.modelType += modelType; // 인스턴스 변수 += 지역 변수
    }

    // ▶︎ [_09_GetterAndSetter_230401] getter & setter
    // 1. modelName getter & setter 메서드 정의
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // 2. modelType getter & setter 메서드 정의
    String getModelType() {
        if (modelType == null || modelType.isEmpty()) {
            return "오류가 발생했습니다.";
        }
        return modelType;
    }
    void setModelType(String modelType) {
        this.modelType = modelType;
    }

    // 3. modelCapacity getter & setter 메서드 정의
    int getModelCapacity() {
        return modelCapacity;
    }

    void setModelCapacity(int modelCapacity) {
        if (modelCapacity < 128) {
            this.modelCapacity = 128;
        } else {
            this.modelCapacity = modelCapacity;
        }
    }

    // 4. modelPrice getter & setter 메서드 정의
    int getModelPrice() {
        return modelPrice;
    }
    void setModelPrice(int modelPrice) {
        this.modelPrice = modelPrice;
    }
}