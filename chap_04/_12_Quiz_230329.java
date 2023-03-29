package chap_04;

// Q. 주차 정산 프로그램 작성하기

/*
1) 주차 요금은 시간 당 4000원 / 일일 최대 요금 30000원
2) 경차 또는 장애인 차량(운전 및 탑승 포함)은 최종 요금에서 50% 할인 적용

예시)
일반 차량 + 5시간 = "주차 요금은 20000원입니다."
경차 또는 장애인 차량 + 5시간 = "주차 요금은 10000원입니다."
경차 또는 장애인 차량 + 10시간 = "주차 요금은 15000원입니다."
*/

public class _12_Quiz_230329 {
    public static void main(String[] args) {
        int hour = 5; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 운전 및 탑승 차량

        int fee = hour * 4000; // 요금
        int max = 30000; // 일일 최대 요금

        // 30000원 초과 시, 일일 최대 요금으로 제한
        if (fee > max) {
            fee = max;
        }

        // 경차 또는 장애인 차량의 경우, 50% 할인 적용
        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }
        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
