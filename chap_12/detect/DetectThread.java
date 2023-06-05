package chap_12.detect;

public class DetectThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) { // 2, 4, 6, 8, 10
            System.out.println("detecter1) " + i + "번째 오류 감지 -> Thread");
        }
        System.out.println("detecter1) 전체 감지 완료 -> Thread");
    }
}