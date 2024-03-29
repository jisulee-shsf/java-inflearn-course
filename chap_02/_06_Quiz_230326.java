package chap_02;

/*
어린이 키에 따라 놀이 기구 탑승 가능 여부를 출력하는 프로그램 작성

설명)
키가 120cm 이상인 경우에만 탑승 가능

예시) 
키가 121cm이므로 탑승이 가능합니다.
*/

public class _06_Quiz_230326 {
    public static void main(String[] args) {
        int height = 121;
        String heightLimit = (height >= 120) ? "탑승이 가능합니다." : "탑승이 불가합니다.";
        System.out.println("키가 " + height + "cm이므로 " + heightLimit);
        /*
        키가 121cm이므로 탑승이 가능합니다.
        */
    }
}