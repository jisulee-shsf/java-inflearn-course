package chap_12.detect;

public class DetectRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 5; i += 2) {
            System.out.println("detect2) " + i + "번째 오류 감지 -> Runnable");
        }
        System.out.println("detect2) 전체 감지 완료 -> Runnable");
    }
}