import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chap1_9();
    }
    public static void chap1_6(){
        // 1. boolean
        boolean flag = true;
        flag = false;

        System.out.println(flag);

        // 2. 문자형(char)
        char alphabet = 'A';
        System.out.println(alphabet);

        // 정수형 (byte, short, int, long)
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483647L;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        // 3. 실수형 (float, double)
        float f = 0.123F;
        double d = 0.123123132;

        System.out.println(f);
        System.out.println(d);

        // 3. 참조형_문자열 변수
        String helloWorld = "Hello World!";

        System.out.println(helloWorld);

        // 배열
        int[] a = {1,2,3};
        System.out.println(Arrays.toString(a));

        // 4. 래퍼 클래스
        // 박싱
        int number = 21;
        Integer num =  number;

        // 언박싱
        System.out.println(num.intValue());
    }
    public static void chat1_7(){
        Scanner sc = new Scanner(System.in);

        int asciiNumber = sc.nextInt();
        char ch = (char) asciiNumber;   // 문자로 형변환을 해주면 숫자에 맞는 아스키 문자로 표현된다.

        char letter = sc.nextLine().charAt(0);  // 첫 번째 글자만 받아오기 위해 charAt(0) 메서드 사용
        int asciiNumber1 = (int)letter;  // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현

        System.out.println(ch);
        System.out.println(asciiNumber1);

    }
    public static void chap1_9(){

        // 형변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double or float -> int
        // 실수 -> 정수 (0.xxx -> 0)

//        double doubleNumber  = 10.101010;
//        float floatNumber = 10.1010f;

        // 변환(int)
//        int intNumber;
//        intNumber = (int) doubleNumber;
//        System.out.println("Double Type => " + doubleNumber);
//        System.out.println("Int Type => " + intNumber);

//        intNumber = (int) floatNumber;
//        System.out.println("Float Type => " + floatNumber);
//        System.out.println("Int Type => " + intNumber);

        // 정수 -> 실수
        int intNumber = 10;

        double doubleNumber = (double) intNumber;
        float floatNumber = (float) intNumber;

        System.out.println("intNum => " + intNumber);
        System.out.println("DoubleNum => " + doubleNumber);
        System.out.println("FloatNum -> " + floatNumber);

        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        // 1. byte -> int
        byte b = 10;
        int i = b;
        System.out.println(i);

        // 2. char -> int 형변환
        char c = 'A';
        i = c;
        System.out.println(i);  // char -> int로 자동 형변환

        // 3. int -> long number 형변환
        i = 100;
        long l = i;
        System.out.println(l);

        // 4. int -> double 형변환
        i = 200;
        double d = i;
        System.out.println(d);


        // 작은 크기의 타입이 큰 크기의 타입과 '계산'될 때 자동으로 큰 크기의 타입으로 형변환이 된다.

        int iNum = 10;
        double dNum = 5.5;
        double result = iNum + dNum;

        System.out.println("PLUS => " + result);


        // 정수로 나누기
        int iResult = iNum / 4;

        // 실수로 나누기
        double dResoult = dNum / 4.0;

        System.out.println(iResult + " / " + dResoult);

    }

    public static void chap2_1(){

    }
}