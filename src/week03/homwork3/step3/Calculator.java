package week03.homwork3.step3;

public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    // Step 1,2
    public double calculator(String operator, int firstNumber, int secondNumber){
        return switch (operator) {
            case "plus" -> addOperation.operate(firstNumber, secondNumber);
            case "sub" -> substractOperation.operate(firstNumber, secondNumber);
            case "mul" -> multiplyOperation.operate(firstNumber, secondNumber);
            case "div" -> divideOperation.operate(firstNumber, secondNumber);
            default -> 0;
        };
    }
}

