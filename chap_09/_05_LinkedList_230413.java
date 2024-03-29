package chap_09;

import java.util.LinkedList;
import java.util.Collections;

public class _05_LinkedList_230413 {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 1. add & get
        list.add("나길동");
        list.add("다길동");
        list.add(2, "다길동");
        list.add("라길동");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        /*
        나길동
        다길동
        다길동
        라길동
        */

        list.addFirst("가길동"); // System.out.println(list.get(0));
        list.addLast("마길동"); // System.out.println(list.get(list.size() - 1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        /*
        가길동
        마길동
        */

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
        list.removeFirst(); // 첫 번째 값 제거 -> 가길동
        list.remove(2); // 중복 제거 -> 다길동
        list.removeLast(); // 마지막 값 제거 -> 마길동
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
            System.out.println(list.size() + "명 중, " + (list.indexOf("다길동") + 1) + "번째 이름 확인");
        } else {
            System.out.println("이름 정보 없음");
        }
        /*
        3명 중, 2번째 이름 확인
        */

        // 4. set
        System.out.println(list.get(2)); // 라길동
        list.set(2, "가길동");
        System.out.println(list.get(2)); // 가길동
        /*
        라길동
        가길동
        */

        // 5. sort
        for (String s : list) {
            System.out.println(s);
        }
        /*
        나길동
        다길동
        가길동
        */

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
        list.clear();
        if (list.isEmpty()) {
            System.out.println("이름 정보 없음");
        } else {
            System.out.println(list.size() + "명 중, 이름 확인");
        }
        /*
        이름 정보 없음
        */
    }
}