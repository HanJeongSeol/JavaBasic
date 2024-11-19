package week04.homwork4.step4;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception{
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값을 입력하세요.");
        }

        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws Exception{
        if(!Pattern.matches(NUMBER_REG, secondInput)){
            throw new BadInputException("정수값을 입력하세요");
        }

        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception{
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("연산자를 입력하세요");
        }

        switch (operationInput){
            case "+" -> this.calculator.setOperation(new AddOperation());
            case "-" -> this.calculator.setOperation(new SubstractOperation());
            case "*" -> this.calculator.setOperation(new MultiplyOperation());
            case "/" -> this.calculator.setOperation(new DivideOperataion());
        }
        return this;
    }

    public double executeCalculator(){
        return calculator.calculator();
    }

}
