package chap_12;

import chap_12.detect.DetectRunnable;

public class _02_Runnable_230428 {
    public static void main(String[] args) {
        DetectRunnable detectRunnable = new DetectRunnable();
        Thread thread = new Thread(detectRunnable);
        thread.start();
        detect1();
        /*
        detect1) 1번째 오류 감지
        detect2) 2번째 오류 감지 -> Runnable
        detect1) 3번째 오류 감지
        detect1) 5번째 오류 감지
        detect2) 4번째 오류 감지 -> Runnable
        detect2) 전체 감지 완료 -> Runnable
        detect1) 전체 감지 완료
        */
    }

    public static void detect1() {
        for (int i = 1; i <= 5; i += 2) {
            System.out.println("detect1) " + i + "번째 오류 감지");
        }
        System.out.println("detect1) 전체 감지 완료");
    }
}