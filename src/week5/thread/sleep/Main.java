package week5.thread.sleep;

public class Main {
    public static void main(String[] args) {
        // try - catch를 사용하여 예외처리를 필수로 해야한다.
        // interrupt()를 만나면 다시 실행되기 때문에 InterruptedException()이 발생할 수 있다.

        Runnable task = () -> {
            try {
                // 특정 쓰레드를 지목 할 수 없다.
                Thread.sleep(2000); // 주어진 시간만큼 기다림
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread-Sleep");
        thread.start();

        try{
            // sleep으로 설정한 1초가 지나면 runnable 상태로 변경되어 다시 실행
            // 현재 흐름의 스레드가 sleep 상태로 전환된다.
            thread.sleep(1000);
            System.out.println("main : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
    }
}
