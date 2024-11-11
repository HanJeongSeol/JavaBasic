package week03;

public class Main {
    public static void main(String[] args) {
        // new 키워드를 사용하여 클래스의 생성자를 호출한다.
        Car[] carArray = new Car[3];
        Car car1 = new Car();
        // 메서드를 사용하여 객체 내부의 필드 값을 변경한다.
        car1.changeGear('P');
        carArray[0] = car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1] = car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2] = car3;

        for(Car car : carArray){
            System.out.println(car.gear);
        }

        // System.out.println(car1);   // 객체가 생성되면 별도 공간에 저장되고 변수는 그 주소를 담고있다.


    }
}
