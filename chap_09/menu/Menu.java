package chap_09.menu;

public class Menu {
    public String menuName;

    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public void orderMenu() {
        System.out.println(this.menuName + " 주문이 입력됐습니다.");
    }
}