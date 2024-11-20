package week5.thread.yield;

// 남은 시간을 다음 쓰레드에게 양보하고, 쓰레드 본인은 실행 대기 상태가 된다.
// 1. thread1, thread2가 같이 1초에 한번씩 출력
// 2. 5초뒤에 thread1에서 InterruptedException 발생
// 3. Thread.yield() 실행되면서 thread1은 실행대기 상태로 변경
// 4. 실행대기 상태로 변경되면서 남은 시간이 thread2에게 양보
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {

                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                Thread.yield();
//                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start();
        thread2.start();

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        thread1.interrupt();
    }
}
