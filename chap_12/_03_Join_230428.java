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
        detecter1) 1번째 오류 감지 -> RunnableJoin
        detecter1) 3번째 오류 감지 -> RunnableJoin
        detecter1) 5번째 오류 감지 -> RunnableJoin
        detecter1) 7번째 오류 감지 -> RunnableJoin
        detecter1) 9번째 오류 감지 -> RunnableJoin
        detecter1) 전체 감지 완료 -> RunnableJoin
        detecter2) 2번째 오류 감지
        detecter2) 4번째 오류 감지
        detecter2) 6번째 오류 감지
        detecter2) 8번째 오류 감지
        detecter2) 10번째 오류 감지
        detecter2) 전체 감지 완료
        */

        thread.start();
        try {
            thread.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        detect();
        /*
        detecter1) 1번째 오류 감지 -> RunnableJoin
        detecter1) 3번째 오류 감지 -> RunnableJoin
        detecter1) 5번째 오류 감지 -> RunnableJoin
        detecter2) 2번째 오류 감지
        detecter1) 7번째 오류 감지 -> RunnableJoin
        detecter2) 4번째 오류 감지
        detecter1) 9번째 오류 감지 -> RunnableJoin
        detecter2) 6번째 오류 감지
        detecter1) 전체 감지 완료 -> RunnableJoin
        detecter2) 8번째 오류 감지
        detecter2) 10번째 오류 감지
        detecter2) 전체 감지 완료
        */
  }

    public static void detect() {
        for (int i = 2; i <= 10; i += 2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("detecter2) " + i + "번째 오류 감지");
        }
        System.out.println("detecter2) 전체 감지 완료");
    }
}