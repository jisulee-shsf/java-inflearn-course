package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet_230414 {
    public static void main(String[] args) {
        // HashSet(중복 허용 불가 & 순서 보장 불가)
        HashSet<String> hashSet = new HashSet<>();

        // 1. add
        hashSet.add("가길동");
        hashSet.add("나길동");
        hashSet.add("다길동");
        hashSet.add("라길동");
        hashSet.add("마길동");
        hashSet.add("마길동");
        hashSet.add("마길동");

        for (String s : hashSet) {
            System.out.println(s);
        }
        /*
        다길동
        나길동
        마길동
        가길동
        라길동
        */

        // 2. remove
        System.out.println(hashSet.size());
        hashSet.remove("가길동");
        System.out.println(hashSet.size());
        /*
        5
        4
        */

        // 3. contains
        if (hashSet.contains("가길동")) {
            System.out.println(hashSet.size() + "명 중, 이름 확인");
        } else {
            System.out.println("이름 정보 없음");
        }
        /*
        이름 정보 없음
        */

        // 4. clear
        hashSet.clear();
        if (hashSet.isEmpty()) {
            System.out.println("이름 정보 없음");
        } else {
            System.out.println(hashSet.size() + "명 중, 이름 확인");
        }
        /*
        이름 정보 없음
        */

        // LinkedHashSet(중복 허용 불가 & 순서 보장)
        HashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 1. add
        linkedHashSet.add("가길동");
        linkedHashSet.add("나길동");
        linkedHashSet.add("다길동");
        linkedHashSet.add("라길동");
        linkedHashSet.add("마길동");
        linkedHashSet.add("마길동");
        linkedHashSet.add("마길동");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }
        /*
        가길동
        나길동
        다길동
        라길동
        마길동
        */

        // 2. remove
        System.out.println(linkedHashSet.size());
        linkedHashSet.remove("가길동");
        System.out.println(linkedHashSet.size());
        /*
        5
        4
        */

        // 3. contains
        if (linkedHashSet.contains("나길동")) {
            System.out.println(linkedHashSet.size() + "명 중, 이름 확인");
        } else {
            System.out.println("이름 정보 없음");
        }
        /*
        4명 중, 이름 확인
        */

        // 4. clear
        linkedHashSet.clear();
        if (linkedHashSet.isEmpty()) {
            System.out.println("이름 정보 없음");
        } else {
            System.out.println(linkedHashSet.size() + "명 중, 이름 확인");
        }
        /*
        이름 정보 없음
        */
    }
}