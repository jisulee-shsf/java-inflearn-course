package chap_12.detect;

public class DetectRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) { // 1, 3, 5, 7, 9
            System.out.println("detector1) " + i + "번째 오류 감지 -> Runnable");
        }
        System.out.println("detector1) 전체 감지 완료 -> Runnable");
    }
}
