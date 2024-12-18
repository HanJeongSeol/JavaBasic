package week02.collection;

import java.util.LinkedList;

// 2-15
public class Col2 {
    public static void main(String[] args) {
        // linked list
        // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놓는다.
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조


        // 기본적 기능은 ArrayList와 동일
        // LinkedList는 값을 여러 공간에 나눠서 저장하기 떄문에 조회 속도는 느라다
        // 대신 값을 추가하거나 삭제할 떄는 빠르다.

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.toString());; // 조회는 arrayList보다 속도가 느리다

        linkedList.add(200);
        System.out.println(linkedList.toString());


        linkedList.add(2, 4);
        System.out.println(linkedList.toString());

        linkedList.set(1, 30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());
        
    }
}
