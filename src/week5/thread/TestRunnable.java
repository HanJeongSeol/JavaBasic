package week5.thread;

// Thread를 상속받아 클래스를 구현하는 것 보다 높은 확장성
public class TestRunnable implements Runnable{
    @Override
    public void run() {
        // 쓰레드에서 수행할 작업
        for(int i = 0; i<100; i++){
            System.out.println("*");
        }
    }
}
