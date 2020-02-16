package book_one.chapter.eleven.tests;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestesScheduledExecutor {

    public static void main(final String[] args) {
        ScheduledExecutorService service = null;
        try {
            service = Executors.newSingleThreadScheduledExecutor();

            final Runnable task1 = () -> System.out.println("Hello Zoo");
            final Callable<String> task2 = () -> {
                System.out.println("Monkey");
                return "Monkey";
            };
            final Runnable task3 = () -> System.out.println("Olá Zoo");
            // final Future<?> result1 = service.schedule(task1, 5, TimeUnit.SECONDS);
            // final Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);
            final Future<?> result3 = service.scheduleAtFixedRate(task1, 2L, 2L, TimeUnit.SECONDS);
            final Future<?> result4 = service.scheduleWithFixedDelay(task3, 2L, 2L, TimeUnit.SECONDS);
        } finally {
            if (service != null) {
                // service.shutdown();
            }
        }
    }

}
