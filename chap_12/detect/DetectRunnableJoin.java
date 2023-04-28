package chap_12.detect;

public class DetectRunnableJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("detect2) " + i + "번째 오류 감지 -> RunnableJoin");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("detect2) 전체 감지 완료 -> RunnableJoin");
    }
}