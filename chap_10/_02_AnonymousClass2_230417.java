package chap_10;

public class _02_AnonymousClass2_230417 {
    public static void main(String[] args) {
        SpecialCoffee firstBranchSpecialCoffee = makeFirstBranchSpecialCoffee();
        firstBranchSpecialCoffee.make();
        /*
        1호점 스페셜 커피입니다.
        */

        SpecialCoffee secondBranchSpecialCoffee = makeSecondBranchSpecialCoffee();
        secondBranchSpecialCoffee.make();
        /*
        2호점 스페셜 커피입니다.
        */
    }

    public static SpecialCoffee makeSecondBranchSpecialCoffee() {
        return new SpecialCoffee() {
            @Override
            public void make() {
                System.out.println("2호점 스페셜 커피입니다.");
            }
        };
    }

    public static SpecialCoffee makeFirstBranchSpecialCoffee() {
        return new SpecialCoffee() {
            @Override
            public void make() {
                System.out.println("1호점 스페셜 커피입니다.");
            }
        };
    }
}

abstract class SpecialCoffee {
    public abstract void make();
}