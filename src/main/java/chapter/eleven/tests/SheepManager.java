package chapter.eleven.tests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {

    private int sheepCount = 0;

    private synchronized void incrementAndReport() {
        System.out.print(++this.sheepCount + " ");
    }

    public static void main(final String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            final SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }

}
