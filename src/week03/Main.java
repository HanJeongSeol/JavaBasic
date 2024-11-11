package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();    // 객체 생성

        // 초기 값, 기본 값 확인 : 초기 값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 설정된다.
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println();

        System.out.println("car.speed = " + car.speed);
        System.out.println("car.gear = " + car.gear);
        System.out.println("car.lights = " + car.lights);
        System.out.println();


        System.out.println("car.tire = " + car.tire);
        System.out.println("car.door = " + car.door);
        System.out.println();


        // 필드 사용
        car.color = "blue";
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color = " + car.color);
        System.out.println("car.speed = " + car.speed);
        System.out.println("car.lights = " + car.lights);

        // gasPedal 메서드를 호출하여 speed와 gear 필드 값을 변경한다.
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println(lights);
        System.out.println("car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 120, 130);
    }
}
