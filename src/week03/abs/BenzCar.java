package week03.abs;

public class BenzCar extends Car {
//    String company; // 자동차 회사 : GENESIS
//    String color; // 자동차 색상
//    double speed;  // 자동차 속도 , km/h
//
//    public double gasPedal(double kmh) {
//        speed = kmh;
//        return speed;
//    }
//
//    public double brakePedal() {
//        speed = 0;
//        return speed;
//    }

    // 차이점이 발생되는 부분만 추상화 구현
    @Override
    public void horn() {
        System.out.println("Benz 빵빵");
    }

}