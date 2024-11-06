package week02.collection;

import java.util.HashSet;
import java.util.Set;

// 2-16
public class Col5 {
    public static void main(String[] args) {
        // Set(집합) :  순서와 중복이 없다
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로글매에서 사용할 수 있는 자료구조
        // Set -> 그냥 쓸 수도 있다. 그러나 HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set은 생성자가 없는 껍데기
        // 생성자가 존재하는 HashSet을 이용해서 Set을 구현


        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        // 중복된 데이터는 출력되지 않는다.
        for(Integer value : intSet){
            System.out.println(value);
        }

        // contains
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));


    }
}
