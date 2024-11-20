package week5.thread;

// 1. Thread 클래스를 상속받아서 사용
public class TestThread extends Thread{
    @Override
    public void run() {
        // 실제 쓰레드에서 수행하는 작업
        for(int i = 0; i<100; i++){
            System.out.println("*");
        }
    }
}
