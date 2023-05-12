package chap_05;

public class _05_ASCII_230330 {
    public static void main(String[] args) {
        // 1. 아스키 코드(A: 65~ / a: 97~ / 0: 48~)
        char c1 = 'A';
        System.out.println(c1); // A
        System.out.println((int) c1); // 65

        char c2 = 'a';
        System.out.println(c2); // a
        System.out.println((int) c2); // 97

        c2++;
        System.out.println(c2); // b
        System.out.println((int) c2); // 98

        char c3 = '0';
        System.out.println(c3); // 0
        System.out.println((int) c3); // 48

        // 2-1. 아스키 코드를 사용하지 않은 경우
        String[][] seats1 = new String[10][15];
        String[] eng = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i < seats1.length; i++) {
            for (int j = 0; j < seats1[i].length; j++) {
                seats1[i][j] = eng[i] + (j + 1);
            }
        }

        for (int i = 0; i < seats1.length; i++) {
            for (int j = 0; j < seats1[i].length; j++) {
                System.out.print(seats1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("순회 종료 #2-1");
        /*
        a1 a2 a3 a4 a5 a6 a7 a8 a9 a10 a11 a12 a13 a14 a15
        b1 b2 b3 b4 b5 b6 b7 b8 b9 b10 b11 b12 b13 b14 b15
        c1 c2 c3 c4 c5 c6 c7 c8 c9 c10 c11 c12 c13 c14 c15
        d1 d2 d3 d4 d5 d6 d7 d8 d9 d10 d11 d12 d13 d14 d15
        e1 e2 e3 e4 e5 e6 e7 e8 e9 e10 e11 e12 e13 e14 e15
        f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 f11 f12 f13 f14 f15
        g1 g2 g3 g4 g5 g6 g7 g8 g9 g10 g11 g12 g13 g14 g15
        h1 h2 h3 h4 h5 h6 h7 h8 h9 h10 h11 h12 h13 h14 h15
        i1 i2 i3 i4 i5 i6 i7 i8 i9 i10 i11 i12 i13 i14 i15
        j1 j2 j3 j4 j5 j6 j7 j8 j9 j10 j11 j12 j13 j14 j15
        순회 종료 #2-1
        */

        // 2-2. 아스키 코드를 사용한 경우
        String[][] seats2 = new String[10][15];
        char c = 'a';
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                seats2[i][j] = String.valueOf(c) + (j + 1);
            }
            c++; // b, c, d ... j
        }

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("순회 종료 #2-2");
        /*
        a1 a2 a3 a4 a5 a6 a7 a8 a9 a10 a11 a12 a13 a14 a15
        b1 b2 b3 b4 b5 b6 b7 b8 b9 b10 b11 b12 b13 b14 b15
        c1 c2 c3 c4 c5 c6 c7 c8 c9 c10 c11 c12 c13 c14 c15
        d1 d2 d3 d4 d5 d6 d7 d8 d9 d10 d11 d12 d13 d14 d15
        e1 e2 e3 e4 e5 e6 e7 e8 e9 e10 e11 e12 e13 e14 e15
        f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 f11 f12 f13 f14 f15
        g1 g2 g3 g4 g5 g6 g7 g8 g9 g10 g11 g12 g13 g14 g15
        h1 h2 h3 h4 h5 h6 h7 h8 h9 h10 h11 h12 h13 h14 h15
        i1 i2 i3 i4 i5 i6 i7 i8 i9 i10 i11 i12 i13 i14 i15
        j1 j2 j3 j4 j5 j6 j7 j8 j9 j10 j11 j12 j13 j14 j15
        순회 종료 #2-2
        */
    }
}