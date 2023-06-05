package chap_12;

public class _04_MultiThread_230428 {
    public static void main(String[] args) {
        Runnable detector1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("detector1) " + i + "번째 오류 감지");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("detector1) 전체 감지 완료");
            }
        };

        Runnable detector2 = () -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("detector2) " + i + "번째 오류 감지");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("detector2) 전체 감지 완료");
        };

        Thread thread1 = new Thread(detector1);
        Thread thread2 = new Thread(detector2);

        thread1.start();
        thread2.start();
        /*
        detector1) 1번째 오류 감지
        detector2) 2번째 오류 감지
        detector2) 4번째 오류 감지
        detector1) 3번째 오류 감지
        detector1) 5번째 오류 감지
        detector2) 6번째 오류 감지
        detector2) 8번째 오류 감지
        detector1) 7번째 오류 감지
        detector2) 10번째 오류 감지
        detector1) 9번째 오류 감지
        detector2) 전체 감지 완료
        detector1) 전체 감지 완료
        */
    }
}