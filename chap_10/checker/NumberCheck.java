package chap_10.checker;

public class NumberCheck implements Checkable {
    @Override
    public void check(int number) {
        System.out.println("NumberCheck: " + number * 10);
    }
}