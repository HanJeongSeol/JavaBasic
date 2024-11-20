package week5.thread.group;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        };

        // ThreadGroup 클래스로 객체 생성
        ThreadGroup group1 = new ThreadGroup("Group1");

        // Thread 객체 생성 시 첫 번째 매개변수로 Group 전달
        // Thread(ThreadGroup group, Runnalbe target, String name) <- 매개변수 타입
        Thread thread1 = new Thread(group1, task, "Thread 1");
        Thread thread2 = new Thread(group1, task, "Thread 2");

        System.out.println("Group of thread1 : " + thread1.getThreadGroup().getName());
        System.out.println("Group of thread2 : " + thread2.getThreadGroup().getName());

        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        // 일시정지 쓰레드를 실행대기 상태로 전환
        group1.interrupt();


    }
}
