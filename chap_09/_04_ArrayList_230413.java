package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList_230413 {
    public static void main(String[] args) {
        // Array List(중복 허용 & 순서 보장)
        ArrayList<String> list = new ArrayList<>();

        // 1. add & get
        list.add("가길동");
        list.add("나길동");
        list.add("다길동");
        list.add("라길동");
        list.add("마길동");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        /*
        가길동
        나길동
        다길동
        라길동
        마길동
        */

        list.add(2, "다길동");
        for (String s : list) {
            System.out.println(s);
        }
        /*
        가길동
        나길동
        다길동
        다길동
        라길동
        마길동
        */

        // 2. size & remove
        System.out.println(list.size());
        list.remove(0); // 첫번째 값 제거
        list.remove(2); // 중복 값 제거
        list.remove(list.size() - 1); // 마지막 값 제거
        System.out.println(list.size());
        /*
        6
        3
        */

        for (String s : list) {
            System.out.println(s);
        }
        /*
        나길동
        다길동
        라길동
        */

        // 3. indexOf & contains
        if (list.indexOf("나길동") == 1) { // 다길동
            System.out.println(list.size() + "명 중, 이름 확인");
        } else {
            System.out.println("이름 정보 없음");
        }
        /*
        이름 정보 없음
        */

        if (list.contains("다길동")) {
            System.out.println(list.size() + "명 중, 이름 확인");
        } else {
            System.out.println("이름 정보 없음");
        }
        /*
        3명 중, 이름 확인
        */

        // 4. set
        System.out.println(list.get(2));
        list.set(2, "가길동");
        System.out.println(list.get(2));
        /*
        라길동
        가길동
        */

        // 5. sort
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
        /*
        가길동
        나길동
        다길동
        */

        // 6. clear
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        /*
        3
        0
        */
    }
}