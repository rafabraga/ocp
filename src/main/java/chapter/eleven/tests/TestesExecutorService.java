package chapter.eleven.tests;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestesExecutorService {

    public static void main(final String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            final Future<?> result = service.submit(() -> {
                int sum = 1;
                for (int i = 0; i < 500000000; i++) {
                    sum += i;
                }
                return sum;
            });
            System.out.println(result.get(10, TimeUnit.SECONDS));
            System.out.println("Reached!");
        } catch (final TimeoutException | InterruptedException | ExecutionException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }

}
