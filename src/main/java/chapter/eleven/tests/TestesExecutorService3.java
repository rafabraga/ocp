package chapter.eleven.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestesExecutorService3 {

    public static void main(final String[] args) throws InterruptedException {
        ExecutorService service = null;
        final Runnable run1 = () -> {
            Long sum = 0L;
            for (int i = 0; i < 50000; i++) {
                sum += i * 3;
            }
            System.out.println("Feito!");
        };
        try {
            service = Executors.newCachedThreadPool();
            for (int i = 0; i < 20; i++) {
                service.submit(run1);
            }
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
