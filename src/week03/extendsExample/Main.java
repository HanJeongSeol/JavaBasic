package week03.extendsExample;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용 -> 부모 클래스는 자식 클래스에 별도로 추가한 필드 및 메서드 사용이 불가능하다.
        Car car = new Car();
        // car.engine = "Orion"; // 오류
        // car.booster(); // 오류

        // 자식 클래스 객체 생성
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine = "Orion";
        sportsCar.booster();

        // 자식 클래스 객체에서 부모 클래스 멤버 사용
        sportsCar.company = "GENESIS";
        sportsCar.setModel("GV80");
        System.out.println("sportsCar.company = " + sportsCar.company);
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        System.out.println();

        sportsCar.horn();
        System.out.println(sportsCar.changeGear('D'));
    }
}