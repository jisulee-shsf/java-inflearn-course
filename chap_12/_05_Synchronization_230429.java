package chap_12;

import chap_12.detect.Detection;

public class _05_Synchronization_230429 {
    public static void main(String[] args) {
        Detection detection = new Detection();

        // 1. 동기화 전
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    detection.detect("detector1");
                }
                System.out.println("detector1) 전체 감지 완료");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    detection.detect("detector2");
                }
                System.out.println("detector2) 전체 감지 완료");
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        /*
        1. 동기화 전
        detector1) 1번째 오류 감지
        detector2) 1번째 오류 감지
        detector1) 2번째 오류 감지
        detector1) 4번째 오류 감지
        detector1) 5번째 오류 감지
        detector2) 3번째 오류 감지
        detector1) 전체 감지 완료
        detector2) 7번째 오류 감지
        detector2) 8번째 오류 감지
        detector2) 전체 감지 완료
        */

        /*
        2. 동기화 후
        detector1) 1번째 오류 감지
        detector1) 2번째 오류 감지
        detector1) 3번째 오류 감지
        detector1) 4번째 오류 감지
        detector2) 5번째 오류 감지
        detector2) 6번째 오류 감지
        detector1) 전체 감지 완료
        detector2) 7번째 오류 감지
        detector2) 8번째 오류 감지
        detector2) 전체 감지 완료
        */
    }
}