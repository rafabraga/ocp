package chapter.eleven.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyFirstExecutorService {

    public static void main(final String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            System.out.println("Inicio");

            executorService.execute(new MyFirstRunnable());
            executorService.execute(new MyFirstRunnable());

            System.out.println("Fim");
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }
    }

}
