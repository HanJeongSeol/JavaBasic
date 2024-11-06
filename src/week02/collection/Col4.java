package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

// 2-16
public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add , peek, poll
        // Queue =  생성자가 있는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>();   // Queue 선언, 생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        // 다시 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        // peek, 조회
        System.out.println(intQueue.peek());

        intQueue.add(4);
        System.out.println(intQueue.size());
    }
}
