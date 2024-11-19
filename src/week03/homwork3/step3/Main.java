package week03.homwork3.step3;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation());

        System.out.println(cal.calculator("plus", 2,3));
        System.out.println(cal.calculator("sub", 5, 2));
        System.out.println(cal.calculator("mul", 3, 5));
        System.out.println(cal.calculator("div", 4, 2));
        System.out.println(cal.calculator("remainder", 5, 3));
    }
}
