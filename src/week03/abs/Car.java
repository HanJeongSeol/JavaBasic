package week03.abs;

public abstract class Car {
    String company; // 자동차 회사 : GENESIS
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    // 추상화 메서드를 선언하는 경우 클래스도 추상화 키워드를 작성해야 한다.
    // 중괄호는 제외
    public abstract void horn();
}