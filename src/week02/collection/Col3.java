package week02.collection;

import java.util.Stack;

// 2-16
public class Col3 {
    public static void main(String[] args) {
        // Stack -> FILO
        // push , peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용

        Stack<Integer> intStack = new Stack<Integer>();     // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때 까지 출력
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop()); // 최상단의 데이터를 빼낸다
        }

        // 다시 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // peek
        System.out.println(intStack.peek());

        System.out.println(intStack.size());

    }
}
