package chap_12;

public class _04_MultiThread_230428 {
    public static void main(String[] args) {
        Runnable detect1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("detect1) " + i + "번째 오류 감지");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("detect1) 전체 감지 완료");
            }
        };

        Runnable detect2 = () -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("detect2) " + i + "번째 오류 감지");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("detect2) 전체 감지 완료");
        };

        Thread thread1 = new Thread(detect1);
        Thread thread2 = new Thread(detect2);

        thread1.start();
        thread2.start();
        /*
        detect1) 1번째 오류 감지
        detect2) 2번째 오류 감지
        detect2) 4번째 오류 감지
        detect1) 3번째 오류 감지
        detect2) 6번째 오류 감지
        detect1) 5번째 오류 감지
        detect1) 7번째 오류 감지
        detect2) 8번째 오류 감지
        detect2) 10번째 오류 감지
        detect1) 9번째 오류 감지
        detect2) 전체 감지 완료
        detect1) 전체 감지 완료
        */
    }
}