package week5.thread.single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () ->{
            System.out.println(Thread.currentThread().getName());
            for(int i=0; i<100; i++){
                System.out.println("$");
            }
        };

        System.out.println("1번 => "+Thread.currentThread().getName());
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");


        thread1.start();
    }
}
