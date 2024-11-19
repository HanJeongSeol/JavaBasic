package week03.homwork3;

public class Main {
    public static void main(String[] args) {
        // Step 1,2
        Calculator cal = new Calculator();

        System.out.println(cal.calculator("plus", 2,3));
        System.out.println(cal.calculator("sub", 5, 2));
        System.out.println(cal.calculator("mul", 3, 5));
        System.out.println(cal.calculator("div", 4, 2));
        System.out.println(cal.calculator("remainder", 5, 3));
    }
}
