package chap_12.detect;

public class DetectThread extends Thread {
    public void run() {
        for (int i = 2; i <= 5; i += 2) {
            System.out.println("detect2) " + i + "번째 오류 감지 -> Thread");
        }
        System.out.println("detect2) 전체 감지 완료 -> Thread");
    }
}