package week02.array;
// 2-12
public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a;    // 얕은 복사 -> 값은 1개로 유지되고 주소 값만 복사된다.

        b[0] = 3;

        System.out.println(a[0]);  // a와 b는 모두 같은 주소를 바라보고 있기 떄문에 b에서 변경된 값도 a에서 그대로 출력된다.
    }
}
