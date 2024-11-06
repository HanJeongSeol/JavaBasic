package week02.array;

import java.util.Arrays;

// 2-12
public class Arr04 {
    public static void main(String[] args) {
        // 2. Array.copyOf() 메서드
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length);   // 배열과 함께 길이(length)값도 넣어준다

        a[3] = 0;
        // 깊은 복사 체크
        System.out.println(a[3]);
        System.out.println(b[3]);


    }
}
