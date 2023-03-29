package chap_05;

public class _03_MultiDimensionalArrays_230330 {
    public static void main(String[] args) {
        // 1. 1차원 array
        String[] seatsA = new String[] {"a1", "a2", "a3", "a4", "a5"};
        String[] seatsB = new String[] {"b1", "b2", "b3", "b4", "b5"};
        String[] seatsC = new String[] {"c1", "c2", "c3", "c4", "c5"};
        System.out.println(seatsB[2]); // b3

        // 2-1. 3 X 5의 2차원 array
        String[][] seats1 = new String[][] {
                {"a1", "a2", "a3", "a4", "a5"},
                {"b1", "b2", "b3", "b4", "b5"},
                {"c1", "c2", "c3", "c4", "c5"}
        };
        System.out.println(seats1[1][2]); // b3

        // 2-2. 크기가 동일하지 않은 2차원 array
        String[][] seats2 = {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3", "b4"},
                {"c1", "c2", "c3", "c4", "c5"}
        };
        System.out.println(seats2[0][2]); // a3
    }
}