package week04.homwork4.step4;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private AbstractOperation operation;

    // 생성자를 사용하여 초기 객체 할당
    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    public Calculator(){}

    // 다른 연산을 위해 AbstractOperation 객체를 변경하기 위한 set 메서드 추가
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }


    public double calculator(){
        double result = 0;
        result = operation.operation(firstNumber, secondNumber);
        return result;
    }
}
