package week03.homwork3.step4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculator(5, 5));
        calculator.setOperation(new SubstractOperation());
        System.out.println(calculator.calculator(10, 5));
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculator(5, 5));
        calculator.setOperation(new DivideOperataion());
        System.out.println(calculator.calculator(8, 2));
    }
}
