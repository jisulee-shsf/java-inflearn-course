package chap_12;

import chap_12.detect.Detection;

public class _05_Syncronized_230429 {
    public static void main(String[] args) {
        Detection detection = new Detection();

        // 1. 동기화 전
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    detection.detect("detect1");
                }
                System.out.println("detect1) 전체 감지 완료");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    detection.detect("detect2");
                }
                System.out.println("detect2) 전체 감지 완료");
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        /*
        1. 동기화 전
        detect1) 1번째 오류 감지
        detect1) 2번째 오류 감지
        detect2) 1번째 오류 감지
        detect1) 3번째 오류 감지
        detect2) 4번째 오류 감지
        detect2) 6번째 오류 감지
        detect2) 7번째 오류 감지
        detect1) 5번째 오류 감지
        detect2) 전체 감지 완료
        detect1) 전체 감지 완료
        */

        /*
        2. 동기화 후
        detect1) 1번째 오류 감지
        detect1) 2번째 오류 감지
        detect1) 3번째 오류 감지
        detect1) 4번째 오류 감지
        detect1) 전체 감지 완료
        detect2) 5번째 오류 감지
        detect2) 6번째 오류 감지
        detect2) 7번째 오류 감지
        detect2) 8번째 오류 감지
        detect2) 전체 감지 완료
        */
    }
}