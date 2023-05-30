package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap_230414 {
    public static void main(String[] args) {
        // HashMap
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
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
        /*
        다길동
        나길동
        마길동
        가길동
        라길동
        */

        for (int value : hashmap.values()) {
            System.out.println(value);
        }
        /*
        30
        20
        70
        10
        40
        */

        for (String key : hashmap.keySet()) {
            System.out.println("key: " + key + "\tvalue: " + hashmap.get(key));
        }
        /*
        key: 다길동	value: 30
        key: 나길동	value: 20
        key: 마길동	value: 70
        key: 가길동	value: 10
        key: 라길동	value: 40
        */

        // 4. remove
        System.out.println(hashmap.size());
        hashmap.remove("마길동");
        System.out.println(hashmap.size());
        /*
        5
        4
        */

        for (String key : hashmap.keySet()) {
            System.out.println("key: " + key + "\tvalue: " + hashmap.get(key));
        }
        /*
        key: 다길동	value: 30
        key: 나길동	value: 20
        key: 가길동	value: 10
        key: 라길동	value: 40
        */

        // 5. containsKey
        if (hashmap.containsKey("가길동")) {
            int i = hashmap.get("가길동");
            hashmap.put("가길동", ++i); // 10 -> 11
            System.out.println("key: 가길동\tvalue: " + hashmap.get("가길동"));
        } else {
            hashmap.put("가길동", 1);
            System.out.println("key: 가길동\tvalue: " + hashmap.get("가길동"));
        }
        /*
        key: 가길동	value: 11
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

        // LinkedHashMap(데이터 저장 순서 유지)
        HashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // 1. put
        linkedHashMap.put("가길동", 10);
        linkedHashMap.put("나길동", 20);
        linkedHashMap.put("다길동", 30);
        linkedHashMap.put("라길동", 40);
        linkedHashMap.put("마길동", 50);
        linkedHashMap.put("마길동", 60);
        linkedHashMap.put("마길동", 70);

        // 2. KeySet & values
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }
        /*
        가길동
        나길동
        다길동
        라길동
        마길동
        */

        for (int value : linkedHashMap.values()) {
            System.out.println(value);
        }
        /*
        10
        20
        30
        40
        70
        */

        for (String key : linkedHashMap.keySet()) {
            System.out.println("key: " + key + "\tvalue: " + linkedHashMap.get(key));
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