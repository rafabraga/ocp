package book_one.chapter.eleven.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestesExecutorService2 {

    public static void main(final String[] args) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            service.submit(() -> {
                int sum = 0;
                for (int i = 0; i < 500000000; i++) {
                    sum += i;
                }
            });
            System.out.println("Reached!");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        if (service != null) {
            service.awaitTermination(10, TimeUnit.SECONDS);
            // Check whether all tasks are finished
            if (service.isTerminated()) {
                System.out.println("All tasks finished");
            } else {
                System.out.println("At least one task is still running");
            }
        }
    }

}
