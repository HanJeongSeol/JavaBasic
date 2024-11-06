package week02.operator;
// 2-2
public class W04 {
    // 논리연산자
    // 비교 연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
    // 조건을 연결하였을 때 boolean 값을 조합하여 true, false 값인 boolean 값을 출력
    // &&(AND), ||(OR), !(NOT)

    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // 1. 하나라도 ture라면 true => OR연산
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);

        // 2. 피 연산자가 모두 true이면 true => AND연산
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);

        // 3. AND
        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        // OR
        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1));

        // 4. 논리 부정 연산자 => NOT 연산
        System.out.println(!flag1);
        System.out.println(!flag3);
        System.out.println(!(5 == 5));
        System.out.println(!(5 == 3));
    }

}
