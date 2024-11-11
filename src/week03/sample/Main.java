package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());

    }

    // 메서드
    public int getNumber(){
        // 지역변수
        // 메서드가 실행될 떄 마다 독립적인 값을 저장하고 관리
        // 메서드 내부에서 정의될 때 생성되고, 메서드 종료시 소멸된다 .
        int number = 1;
        number +=1;
        return number;
    }

    // final : 초기 값이 저장되면 해당 값을 프로그램이 실행되는 도중 절대 수정 할 수 없다.
    // static final : 반드시 한 개이며 불변의 값을 의미한다. 인스턴스마다 상수를 저장 할 필요가 없다.
}
