package week03.homwork3;

public class Calculator {
    // Step 1,2
    public double calculator(String operator, int firstNumber, int secondNumber){
        return switch (operator) {
            case "plus" -> firstNumber + secondNumber;
            case "sub" -> firstNumber - secondNumber;
            case "mul" -> firstNumber * secondNumber;
            case "div" -> (double) firstNumber / secondNumber;
            case "remainder" -> firstNumber % secondNumber;
            default -> 0;
        };
    }
}

