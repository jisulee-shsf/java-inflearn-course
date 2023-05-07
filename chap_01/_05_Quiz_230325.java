package chap_01;

/*
버스 도착 정보를 출력하는 프로그램 작성

예시)
신당03번 버스
약 3분 후 도착
남은 거리 1.3km
*/

public class _05_Quiz_230325 {
    public static void main(String[] args) {
        String busNo = "신당03";
        int time = 3;
        float distance = 1.3f;

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + time + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
        /*
        신당03번 버스
        약 3분 후 도착
        남은 거리 1.3km
        */
    }
}