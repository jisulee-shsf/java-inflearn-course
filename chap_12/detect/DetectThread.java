package chap_12.detect;

public class DetectThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) { // 1, 3, 5, 7, 9
            System.out.println("detecter1) " + i + "번째 오류 감지 -> Thread");
        }
        System.out.println("detecter1) 전체 감지 완료 -> Thread");
    }
}