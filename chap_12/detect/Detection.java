package chap_12.detect;

public class Detection {
    public int number = 1;
    synchronized public void detect(String thread) {
        System.out.println(thread + ") " + number + "번째 오류 감지");
        number++;
    }
}