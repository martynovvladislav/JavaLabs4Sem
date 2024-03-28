package lab4;

import java.util.concurrent.ExecutorService;

public class Task {
    public static void main(String[] args) {
        ExecutorService executorService = new MyExecutorService(2);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second Message: We run it");
        });
        executorService.submit(() -> System.out.println("First Message: Start"));

    }
}
