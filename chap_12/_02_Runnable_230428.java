package chap_12;

import chap_12.detect.DetectRunnable;

public class _02_Runnable_230428 {
    public static void main(String[] args) {
        DetectRunnable detectRunnable = new DetectRunnable();
        Thread thread = new Thread(detectRunnable);
        thread.start();
        detect();
        /*
        detecter1) 1번째 오류 감지 -> Runnable
        detecter2) 2번째 오류 감지
        detecter1) 3번째 오류 감지 -> Runnable
        detecter2) 4번째 오류 감지
        detecter1) 5번째 오류 감지 -> Runnable
        detecter1) 7번째 오류 감지 -> Runnable
        detecter1) 9번째 오류 감지 -> Runnable
        detecter1) 전체 감지 완료 -> Runnable
        detecter2) 6번째 오류 감지
        detecter2) 8번째 오류 감지
        detecter2) 10번째 오류 감지
        detecter2) 전체 감지 완료
        */
    }

    public static void detect() {
        for (int i = 2; i <= 10; i += 2) {  // 2, 4, 6, 8, 10
            System.out.println("detecter2) " + i + "번째 오류 감지");
        }
        System.out.println("detecter2) 전체 감지 완료");
    }
}