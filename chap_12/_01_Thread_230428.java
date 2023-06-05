package chap_12;

import chap_12.detect.DetectThread;

public class _01_Thread_230428 {
    public static void main(String[] args) {
        DetectThread detectThread = new DetectThread();
        detectThread.run();
        detect();
        /*
        detecter1) 2번째 오류 감지 -> Thread
        detecter1) 4번째 오류 감지 -> Thread
        detecter1) 6번째 오류 감지 -> Thread
        detecter1) 8번째 오류 감지 -> Thread
        detecter1) 10번째 오류 감지 -> Thread
        detecter1) 전체 감지 완료 -> Thread
        detecter2) 1번째 오류 감지
        detecter2) 3번째 오류 감지
        detecter2) 5번째 오류 감지
        detecter2) 7번째 오류 감지
        detecter2) 9번째 오류 감지
        detecter2) 전체 감지 완료
        */

        detectThread.start();
        detect();
        /*
        detecter2) 1번째 오류 감지
        detecter1) 2번째 오류 감지 -> Thread
        detecter2) 3번째 오류 감지
        detecter1) 4번째 오류 감지 -> Thread
        detecter2) 5번째 오류 감지
        detecter2) 7번째 오류 감지
        detecter2) 9번째 오류 감지
        detecter2) 전체 감지 완료
        detecter1) 6번째 오류 감지 -> Thread
        detecter1) 8번째 오류 감지 -> Thread
        detecter1) 10번째 오류 감지 -> Thread
        detecter1) 전체 감지 완료 -> Thread
        */
    }

    public static void detect() {
        for (int i = 1; i <= 10; i += 2) {  // 1, 3, 5, 7, 9
            System.out.println("detecter2) " + i + "번째 오류 감지");
        }
        System.out.println("detecter2) 전체 감지 완료");
    }
}