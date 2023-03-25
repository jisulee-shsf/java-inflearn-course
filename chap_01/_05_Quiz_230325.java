package chap_01;

// Q. 버스 도착 정보를 출력하는 프로그램 작성하기

/*
신당03번 버스
약 3분 후 도착
남은 거리 1.3km
*/

public class _05_Quiz_230325 {
    public static void main(String[] args) {
        // 신당03번 버스
        String busNo = "신당03";
        System.out.println(busNo + "번 버스");
        
        // 약 3분 후 도착
        int time = 3;
        System.out.println("약 " + time + "분 후 도착");
        
        // 남은 거리 1.3km
        float distance = 1.3F;
        System.out.println("남은 거리 " + distance + "km");
    }
}
