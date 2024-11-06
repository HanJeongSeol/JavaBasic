package week02.operator;
// 2-1
public class W02 {
    public static void main(String[] args) {
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);  // 몫만 출력
        System.out.println(2 / 4);
        System.out.println(4 % 2);  // 나머지 값만 출력
        System.out.println(5 % 2);


        // 우선순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);
    }
}
