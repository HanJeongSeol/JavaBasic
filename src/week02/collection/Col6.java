package week02.collection;

import java.util.HashMap;
import java.util.Map;

// 2-16
public class Col6 {
    public static void main(String[] args) {
        // Map : key - value의 쌍으로 존재
        // key라는 값으로 uniuqe하게 보장이 돼아함
        // Map -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        // 키 - 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 15);
        intMap.put("삼", 16);

        // key값 전체 출력
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        // value값 전체 출력
        // 똑같은 key 값으로 중복된 데이터가 들어가는 경우, 가장 최근에 들어간 데이터로 업데이트 된다.
        for (Integer value : intMap.values()) {
            System.out.println(value);
        }

        // sout
        System.out.println(intMap.get("삼"));

    }
}
