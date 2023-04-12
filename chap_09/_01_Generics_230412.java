package chap_09;

public class _01_Generics_230412 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5}; // 래퍼 클래스(기본형 -> 객체)
        String[] stringArray = {"a", "b", "c", "d", "e"};

        printAnyArray(intArray);
        printAnyArray(stringArray);
        /*
        1 2 3 4 5
        a b c d e
        */
    }

    // 제네릭스
    public static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}