package chap_12;

import chap_12.detect.DetectRunnableJoin;

public class _03_Join_230428 {
    public static void main(String[] args) {
        DetectRunnableJoin detectRunnableJoin = new DetectRunnableJoin();
        Thread thread = new Thread(detectRunnableJoin);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        detect();
        /*
        detector1) 1번째 오류 감지 -> RunnableJoin
        detector1) 3번째 오류 감지 -> RunnableJoin
        detector1) 5번째 오류 감지 -> RunnableJoin
        detector1) 7번째 오류 감지 -> RunnableJoin
        detector1) 9번째 오류 감지 -> RunnableJoin
        detector1) 전체 감지 완료 -> RunnableJoin
        detector2) 2번째 오류 감지
        detector2) 4번째 오류 감지
        detector2) 6번째 오류 감지
        detector2) 8번째 오류 감지
        detector2) 10번째 오류 감지
        detector2) 전체 감지 완료
        */

        thread.start();
        try {
            thread.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        detect();
        /*
        detector1) 1번째 오류 감지 -> RunnableJoin
        detector1) 3번째 오류 감지 -> RunnableJoin
        detector1) 5번째 오류 감지 -> RunnableJoin
        detector2) 2번째 오류 감지
        detector1) 7번째 오류 감지 -> RunnableJoin
        detector2) 4번째 오류 감지
        detector1) 9번째 오류 감지 -> RunnableJoin
        detector2) 6번째 오류 감지
        detector1) 전체 감지 완료 -> RunnableJoin
        detector2) 8번째 오류 감지
        detector2) 10번째 오류 감지
        detector2) 전체 감지 완료
        */
  }

    public static void detect() {
        for (int i = 2; i <= 10; i += 2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("detector2) " + i + "번째 오류 감지");
        }
        System.out.println("detector2) 전체 감지 완료");
    }
}