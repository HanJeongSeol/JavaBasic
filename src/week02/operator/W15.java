package week02.operator;
public class W15 {
    // 2-8
    public static void main(String[] args) {
        // for문
        // (초기값 ; 조건문 ; 증가연산)
        for(int i = 0; i<4; i++){
            System.out.println(i + "번째 출력!");
        }

        // 향상된 for문 
        int[] numbers = {3,6,9,12,15};
        for(int number : numbers){
            System.out.println(number + " ");
        }

        int[] numbers1 = {3,6,9,12,15};
        for(int i = 0; i< numbers1.length; i++){
            System.out.println(numbers1[i] + " ");
        }
        
    }
}
