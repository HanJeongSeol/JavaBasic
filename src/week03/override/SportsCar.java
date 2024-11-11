package week03.override;

public class SportsCar extends Car{
    String engine;
    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public SportsCar(String engine) {
        this.engine = engine;
    }

    // 부모의 메서드를 오버라이드하여 수정
    @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    // 부모의 메서드를 오버라이드하여 수정
    @Override
    public void horn() {
        booster();
    }
}