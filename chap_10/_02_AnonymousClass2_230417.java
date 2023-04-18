package chap_10;

public class _02_AnonymousClass2_230417 {
    public static void main(String[] args) {
        Branch firstBranch = offerFirstBranchDiscount();
        firstBranch.sell();
        /*
        반갑습니다. 000 1호 지점입니다.
        구매하신 물품에 5% 할인이 적용되었습니다.
        */

        Branch secondBranch = offerSecondBranchDiscount();
        secondBranch.sell();
        /*
        반갑습니다. 000 2호 지점입니다.
        구매하신 물품에 15% 할인이 적용되었습니다.
        */
    }

    // 익명 클래스
    private static Branch offerSecondBranchDiscount() {
        return new Branch() {
            @Override
            public void sell() {
                System.out.println("반갑습니다. 000 2호 지점입니다.");
                System.out.println("구매하신 물품에 15% 할인이 적용되었습니다.");
            }
        };
    }

    public static Branch offerFirstBranchDiscount() {
        return new Branch() {
            @Override
            public void sell() {
                System.out.println("반갑습니다. 000 1호 지점입니다.");
                System.out.println("구매하신 물품에 5% 할인이 적용되었습니다.");
            }
        };
    }

}
// 추상 클래스
abstract class Branch{
    public abstract void sell();
}
