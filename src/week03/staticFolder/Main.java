package week03.staticFolder;

public class Main {
    public static void main(String[] args) {
        // 클래스 필드 company 확인
        System.out.println(Car.company + "\n");
        // 클래스 필드 변경 및 확인, 클래스 이름으로 바로 호출 할 수 있다.
        Car.company = "Audi";
        System.out.println(Car.company + "\n");

        // 클래스 메서드 호출, 클래스 이름으로 바로 호출 할 수 있다.
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName = " + companyName);

        System.out.println();
        // 참조형 변수 사용
        Car car = new Car(); // 객체 생성

        // 클래스 변수이기 때문에 `Car.company`로 접근하는게 바람직하다. 여기서는 테스트를 위해 참조변수 사용
        car.company = "Ferrari";
        System.out.println(car.company + "\n");

        // 클래스 메서드이기 때문에 `Car.setCompany`로 접근하는게 바람직하다. 여기서는 테스트를 위해 참조변수 사용
        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("companyName2 = " + companyName2);
    }
}
