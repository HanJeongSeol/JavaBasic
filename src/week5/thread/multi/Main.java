package week5.thread.multi;

// 걸리는 시간 및 동작 예측이 불가능하다.
public class Main {
    public static void main(String[] args) {
        Runnable task = () ->{
            for(int i=0; i<100; i++){
                System.out.println("$");
            }
        };

        Runnable task2 = () ->{
            for(int i=0; i<100; i++){
                System.out.println("*");
            }
        };

        System.out.println("1번 => "+Thread.currentThread().getName());
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");


        thread1.start();
        thread2.start();
    }
}

