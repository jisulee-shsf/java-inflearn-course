package chap_01;

public class _02_Variables_230324 {
    public static void main(String[] args) {
        String name = "홍길동";
        int time = 12;
        System.out.println(name + "님, 주문하신 물품이 " + time + "시에 배송될 예정입니다.");
        /*
        홍길동님, 주문하신 물품이 12시에 배송될 예정입니다.
        */

        name = "김길동"; // 변수 업데이트
        String subject = "영어";
        double score = 95.5;
        char grade = 'A';
        boolean pass = true;
        System.out.println(name + "님의 " + subject + " 과목 점수는 " + score + "점이며, 학점은 " + grade + "입니다.");
        System.out.println(name + "님은 " + subject + " 과목을 수료했습니까? " + pass);
        /*
        김길동님의 영어 과목 점수는 95.5점이며, 학점은 A입니다.
        김길동님은 영어 과목을 수료했습니까? true
        */

        double d = 3.14;
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);
        /*
        3.14
        3.14
        */

        d = 3.1412341234;
        f = 3.1412341234f;
        System.out.println(d);
        System.out.println(f);
        /*
        3.1412341234
        3.1412342
        */

        // int i = 1000000000000;
        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);
        /*
        1000000000000
        */
    }
}