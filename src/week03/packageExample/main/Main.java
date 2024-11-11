package week03.packageExample.main;


import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();

        car1.horn();
        car2.horn();

        Car car = new Car();
        car.horn();

    }
}
