package week02.operator;
// 2-3
public class W06 {

    public static void main(String[] args) {
        // 대입 연산자에서 주의해야 할 점
        // ++, --

        int a= 10;
        int b = 10;
        // 대입 연산자가 앞에 있다면 값을 증감 시킨 후 연산을 진행한다.
        // 뒤에 있다면 연산이 끝난 뒤에 값을 증감시킨다.
        // 즉, b는 연산 결과가 val에 대입되면 `--` 연산을 수행한다.
        int val = ++a + b--;
        System.out.println(val);       // 21
    }
}
