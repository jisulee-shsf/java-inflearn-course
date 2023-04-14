package chap_09;

import java.util.*;

public class _08_Iterator_230414 {
    public static void main(String[] args) {
        // Iterator
        // 1. ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("가길동");
        list.add("이름 없음");
        list.add("이름 없음");
        list.add("나길동");
        list.add("다길동");
        list.add("이름 없음");
        list.add("라길동");
        list.add("마길동");

        for (String s : list) {
            System.out.println(s);
        }
        /*
        가길동
        이름 없음
        이름 없음
        나길동
        다길동
        이름 없음
        라길동
        마길동
        */

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            String s = iterator1.next();
            if (s.contains("이름 없음")) {
                iterator1.remove();
            }
        }

        iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        /*
        가길동
        나길동
        다길동
        라길동
        마길동
        */

        // 2. HashSet
        HashSet<String> set = new HashSet<>();

        set.add("가길동");
        set.add("이름 없음");
        set.add("이름 없음");
        set.add("나길동");
        set.add("다길동");
        set.add("이름 없음");
        set.add("라길동");
        set.add("마길동");

        for (String s : set) {
            System.out.println(s);
        }
        /*
        다길동
        이름 없음
        나길동
        마길동
        가길동
        라길동
        */

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            String s = iterator2.next();
            if (s.contains("이름 없음")) {
                iterator2.remove();
            }
        }

        iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        /*
        다길동
        나길동
        마길동
        가길동
        라길동
        */

        // 3. HashMap
        HashMap<String, Integer> map = new HashMap<>();

        map.put("가길동", 10);
        map.put("이름 없음", 0);
        map.put("이름 없음", 0);
        map.put("나길동", 20);
        map.put("다길동", 30);
        map.put("이름 없음", 0);
        map.put("라길동", 40);
        map.put("마길동", 50);

        for (String s : map.keySet()) {
            System.out.println(s);
        }
        /*
        다길동
        이름 없음
        나길동
        마길동
        가길동
        라길동
        */
        System.out.println("테스트");

        // 3-1. KeySet
        Iterator<String> iteratorKey = map.keySet().iterator();
        while (iteratorKey.hasNext()) {
            String s = iteratorKey.next();
            if (s.contains("이름 없음")) {
                iteratorKey.remove();
            }
        }

        iteratorKey = map.keySet().iterator();
        while (iteratorKey.hasNext()) {
            System.out.println(iteratorKey.next());
        }
        /*
        다길동
        나길동
        마길동
        가길동
        라길동
        */

        // 3-2. values
        map.clear();
        map.put("가길동", 10);
        map.put("이름 없음", 0);
        map.put("이름 없음", 0);
        map.put("나길동", 20);
        map.put("다길동", 30);
        map.put("이름 없음", 0);
        map.put("라길동", 40);
        map.put("마길동", 50);

        for (int i : map.values()) {
            System.out.println(i);
        }
        /*
        30
        0
        20
        50
        10
        40
        */

        Iterator<Integer> iteratorValue = map.values().iterator();
        while (iteratorValue.hasNext()) {
            int i = iteratorValue.next();
            if (i < 1) {
                iteratorValue.remove();
            }
        }

        iteratorValue = map.values().iterator();
        while (iteratorValue.hasNext()) {
            System.out.println(iteratorValue.next());
        }
        /*
        30
        20
        50
        10
        40
        */

        // 3-3. entrySet
        map.clear();
        map.put("가길동", 10);
        map.put("이름 없음", 0);
        map.put("이름 없음", 0);
        map.put("나길동", 20);
        map.put("다길동", 30);
        map.put("이름 없음", 0);
        map.put("라길동", 40);
        map.put("마길동", 50);

        for (String s : map.keySet()) {
            System.out.println("key: " + s + "\tvalue: " + map.get(s));
        }
        /*
        key: 다길동	value: 30
        key: 이름 없음	value: 0
        key: 나길동	value: 20
        key: 마길동	value: 50
        key: 가길동	value: 10
        key: 라길동	value: 40
        */

        Iterator<Map.Entry<String, Integer>> iteratorEntrySet = map.entrySet().iterator();
        while (iteratorEntrySet.hasNext()) {
            System.out.println(iteratorEntrySet.next());
        }
        /*
        다길동=30
        이름 없음=0
        나길동=20
        마길동=50
        가길동=10
        라길동=40
        */
    }
}