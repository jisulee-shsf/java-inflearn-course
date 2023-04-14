package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap_230414 {
    public static void main(String[] args) {
        // HashMap(중복 허용 불가 & 순서 보장 불가)
        HashMap<String, Integer> hashmap = new HashMap<>();

        // 1. put
        hashmap.put("가길동", 10);
        hashmap.put("나길동", 20);
        hashmap.put("다길동", 30);
        hashmap.put("라길동", 40);
        hashmap.put("마길동", 50);
        hashmap.put("마길동", 60);
        hashmap.put("마길동", 70);

        // 2. get
        System.out.println(hashmap.get("가길동"));
        System.out.println(hashmap.get("나길동"));
        System.out.println(hashmap.get("마길동"));
        System.out.println(hashmap.size());
        /*
        10
        20
        70
        5
        */

        // 3. KeySet & values
        for (String s : hashmap.keySet()) {
            System.out.println(s);
        }
        /*
        다길동
        나길동
        마길동
        가길동
        라길동
        */

        for (int i : hashmap.values()) {
            System.out.println(i);
        }
        /*
        30
        20
        70
        10
        40
        */

        for (String s : hashmap.keySet()) {
            System.out.println("key: " + s + "\tvalue: " + hashmap.get(s));
        }
        /*
        key: 다길동	value: 30
        key: 나길동	value: 20
        key: 마길동	value: 70
        key: 가길동	value: 10
        key: 라길동	value: 40
        */

        // 4. containsKey
        if (hashmap.containsKey("가길동")) {
            int i = hashmap.get("가길동");
            hashmap.put("가길동", ++i); // 최종값 업데이트
            System.out.println("key: 가길동\tvalue: " + hashmap.get("가길동"));
        } else {
            hashmap.put("가길동", 1);
            System.out.println("key: 가길동\tvalue: " + hashmap.get("가길동"));
        }
        /*
        key: 가길동	value: 11
        */

        // 5. remove
        System.out.println(hashmap.size());
        hashmap.remove("마길동");
        System.out.println(hashmap.size());
        /*
        5
        4
        */

        // 6. clear
        hashmap.clear();
        if (hashmap.isEmpty()) {
            System.out.println("이름 정보 없음");
        } else {
            System.out.println(hashmap.size() + "명 중, 이름 확인");
        }
        /*
        이름 정보 없음
        */

        // LinkedHashMap(중복 허용 불가 & 순서 보장)
        HashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // 1. put
        linkedHashMap.put("가길동", 10);
        linkedHashMap.put("나길동", 20);
        linkedHashMap.put("다길동", 30);
        linkedHashMap.put("라길동", 40);
        linkedHashMap.put("마길동", 50);
        linkedHashMap.put("마길동", 60);
        linkedHashMap.put("마길동", 70);

        // 2. get & keySet
        for (String s : linkedHashMap.keySet()) {
            System.out.println("key: " + s + "\tvalue: " + linkedHashMap.get(s));
        }
        /*
        key: 가길동	value: 10
        key: 나길동	value: 20
        key: 다길동	value: 30
        key: 라길동	value: 40
        key: 마길동	value: 70
        */
    }
}