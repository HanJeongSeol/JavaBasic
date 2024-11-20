package week5.thread.join;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread");

        thread.start();

        long start = System.currentTimeMillis();

        try{
            // 시간 지정을 하지 않으면 thread가 작업을 끝낼 때 까지 main 쓰레디는 대기한다.
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("소요 시간 = " + (System.currentTimeMillis() - start));
    }
}
