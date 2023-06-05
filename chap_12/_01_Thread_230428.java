package chap_12;

import chap_12.detect.DetectThread;

public class _01_Thread_230428 {
    public static void main(String[] args) {
        DetectThread detectThread = new DetectThread();
        detectThread.run();
        detect();
        /*
        detector1) 1번째 오류 감지 -> Thread
        detector1) 3번째 오류 감지 -> Thread
        detector1) 5번째 오류 감지 -> Thread
        detector1) 7번째 오류 감지 -> Thread
        detector1) 9번째 오류 감지 -> Thread
        detector1) 전체 감지 완료 -> Thread
        detector2) 2번째 오류 감지
        detector2) 4번째 오류 감지
        detector2) 6번째 오류 감지
        detector2) 8번째 오류 감지
        detector2) 10번째 오류 감지
        detector2) 전체 감지 완료
        */

        detectThread.start();
        detect();
        /*
        detector2) 2번째 오류 감지
        detector2) 4번째 오류 감지
        detector1) 1번째 오류 감지 -> Thread
        detector1) 3번째 오류 감지 -> Thread
        detector1) 5번째 오류 감지 -> Thread
        detector1) 7번째 오류 감지 -> Thread
        detector2) 6번째 오류 감지
        detector1) 9번째 오류 감지 -> Thread
        detector1) 전체 감지 완료 -> Thread
        detector2) 8번째 오류 감지
        detector2) 10번째 오류 감지
        detector2) 전체 감지 완료
        */
    }

    public static void detect() {
        for (int i = 2; i <= 10; i += 2) {  // 2, 4, 6, 8, 10
            System.out.println("detector2) " + i + "번째 오류 감지");
        }
        System.out.println("detector2) 전체 감지 완료");
    }
}
