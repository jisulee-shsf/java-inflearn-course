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
        detect1();
        /*
        detect2) 2번째 오류 감지 -> RunnableJoin
        detect2) 4번째 오류 감지 -> RunnableJoin
        detect2) 6번째 오류 감지 -> RunnableJoin
        detect2) 8번째 오류 감지 -> RunnableJoin
        detect2) 10번째 오류 감지 -> RunnableJoin
        detect2) 전체 감지 완료 -> RunnableJoin
        detect1) 1번째 오류 감지
        detect1) 3번째 오류 감지
        detect1) 5번째 오류 감지
        detect1) 7번째 오류 감지
        detect1) 9번째 오류 감지
        detect1) 전체 감지 완료
        */

        System.out.println("----");
        thread.start();
        try {
            thread.join(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        detect1();
        /*
        detect2) 2번째 오류 감지 -> RunnableJoin
        detect2) 4번째 오류 감지 -> RunnableJoin
        detect2) 6번째 오류 감지 -> RunnableJoin
        detect1) 1번째 오류 감지
        detect2) 8번째 오류 감지 -> RunnableJoin
        detect1) 3번째 오류 감지
        detect2) 10번째 오류 감지 -> RunnableJoin
        detect1) 5번째 오류 감지
        detect2) 전체 감지 완료 -> RunnableJoin
        detect1) 7번째 오류 감지
        detect1) 9번째 오류 감지
        detect1) 전체 감지 완료
        */
    }

    public static void detect1() {
        for (int i = 1; i <= 10; i += 2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("detect1) " + i + "번째 오류 감지");
        }
        System.out.println("detect1) 전체 감지 완료");
    }
}