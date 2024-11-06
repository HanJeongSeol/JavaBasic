package week02.array;
// 2-12 - String
public class Arr05 {
    public static void main(String[] args) {
        // String = char[]

        // 1. 기본형 변수는 '소문자로 시작함', 참조형 변수는 '대문자로 시작함'
        //  - Wrapper class에서 기본형 변수를 감싸줄 때 : int -> Integer
        // 2. 가본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장한 후 그 주소를 저장


        // String 기능 활용 예시
        String str = "ABCD";

        // 1. length
        int strLength = str.length();
        System.out.println(strLength);


        // 2. charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // 3. subString(int fromIdx, int toIdx)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        // 4. equals(String str)
        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // 5. toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // 6. char[] -> String -> char
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
