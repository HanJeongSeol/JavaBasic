package week03.homwork3.step4;

public class Calculator {
    private AbstractOperation operation;

    // 생성자를 사용하여 초기 객체 할당
    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    // 다른 연산을 위해 AbstractOperation 객체를 변경하기 위한 set 메서드 추가
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculator(int firstNumber, int secondNumber){
        double result = 0;
        result = operation.operation(firstNumber, secondNumber);
        return result;
    }
}
