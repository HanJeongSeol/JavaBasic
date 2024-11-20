package week5.thread.modern;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class LambdaAndStream {
    public static void main(String[] args) {
        ArrayList<Car> carsWantToPark = new ArrayList<>();
        ArrayList<Car> parkingLot = new ArrayList<>();

        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);


        // Predicate<T> 인턴페이스의 test 메서드 구현은 람다식과 메서드 참조로 구현할 수 있다.

        // 인터페이스 구현체의 내부적 동작
//        public boolean test(Car car){
//            return Car.hasTicket(car);
//        }
//        parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::hasTicket));
//        parkingLot.addAll(parkingCarWithMoney(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car::noTicketButMoney));

        // 익명함수 활용
        parkingLot.addAll(parkCars(carsWantToPark, (Car car) -> car.hasParkingTicket() && car.getParkingMoney() > 1000));





        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }


    }

    // 타입??? -> (함수형) 인터페이스
    // 인터페이스는 타입 역할을 할 수 없기 때문이다.
    // 함수형 인터페이스 : 추상 메소드를 딱 하나만 가지고 있다.
//    public exampleMethod (int parameter1, ??? parameterFunction){
//        parameterFunction~~~
//    }

    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
        ArrayList<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            if (car.hasParkingTicket()) {
                cars.add(car);
            }
        }

        return cars;
    }

    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
        ArrayList<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
                cars.add(car);
            }
        }

        return cars;
    }

    // parkingCarWithTicket, parkingCarWithMoney 메서드를 하나로 -> 내부 주요 로직을 함수로 전달받는다
    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function){
        List<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            // 전달받은 함수를 사용해서 구현한다
            if(function.test(car)){
                cars.add(car);
            }
        }
        return cars;
    }
}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    public static boolean hasTicket(Car car){
        return car.hasParkingTicket && car.getParkingMoney() > 1000;
    }

    public static boolean noTicketButMoney(Car car){
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}

// 함수형 인터페이스
// 단 하나의 추상 메서드를 갖는다
interface Predicate<T> {
    boolean test(T t);
}