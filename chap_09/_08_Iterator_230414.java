package chap_09;

import java.util.*;

public class _08_Iterator_230414 {
    public static void main(String[] args) {
        //
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

        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            if (s.contains("이름 없음")) {
                listIterator.remove();
            }
        }

        listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
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

        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String s = setIterator.next();
            if (s.contains("이름 없음")) {
                setIterator.remove();
            }
        }

        setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
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

        for (String key : map.keySet()) {
            System.out.println(key);
        }
        /*
        다길동
        이름 없음
        나길동
        마길동
        가길동
        라길동
        */

        // 3-1. KeySet
        Iterator<String> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            if (key.contains("이름 없음")) {
                keyIterator.remove();
            }
        }

        keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
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

        for (int value : map.values()) {
            System.out.println(value);
        }
        /*
        30
        0
        20
        50
        10
        40
        */

        Iterator<Integer> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            int value = valueIterator.next();
            if (value < 1) {
                valueIterator.remove();
            }
        }

        valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
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
        map.put("나길동", 20);
        map.put("다길동", 30);
        map.put("라길동", 40);
        map.put("마길동", 50);

        for (String key : map.keySet()) {
            System.out.println("key: " + key + "\tvalue: " + map.get(key));
        }
        /*
        key: 다길동	value: 30
        key: 나길동	value: 20
        key: 마길동	value: 50
        key: 가길동	value: 10
        key: 라길동	value: 40
        */

        Iterator<Map.Entry<String, Integer>> entrySetIterator = map.entrySet().iterator();
        while (entrySetIterator.hasNext()) {
            System.out.println(entrySetIterator.next());
        }
        /*
        다길동=30
        나길동=20
        마길동=50
        가길동=10
        라길동=40
        */
    }
}