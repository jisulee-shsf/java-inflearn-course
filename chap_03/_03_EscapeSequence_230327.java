package chap_03;

public class _03_EscapeSequence_230327 {
    public static void main(String[] args) {
        // 1. \n: 줄바꿈
        String s1 = "I";
        String s2 = "like";
        String s3 = "Java.";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("I\nlike\nJav.");

        // 2. \t: 탭
        System.out.println("score\t95.5");
        System.out.println("grade\tA");

        // 3. \\: 역슬래시
        System.out.println("C:\\Program Files\\Java"); // C:\Program Files\Java

        // 4. \\" & \\': 큰따옴표 / 작은따옴표
        System.out.println("그녀는 \"자바는 재밌어\"라고 말했습니다."); // 그녀는 "자바는 재밌어"라고 말했습니다.
        System.out.println("그녀가 가장 좋아하는 것은 \'자바\'이다."); // 그녀가 가장 좋아하는 것은 '자바'이다.

        char c = '\'';
        System.out.println(c); // '
    }
}
