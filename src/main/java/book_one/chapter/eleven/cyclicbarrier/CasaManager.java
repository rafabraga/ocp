package book_one.chapter.eleven.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CasaManager {

    public void lavarCalcada() {
        System.out.println("Lavando calçada.");
    }

    public void cortarGrama() {
        System.out.println("Cortando grama.");
    }

    public void tirarPo() {
        System.out.println("Tirando o pó dos móveis.");
    }

    public void fazerFaxinaCompleta(final CyclicBarrier cyclicBarrier) {
        try {
            this.lavarCalcada();
            this.cortarGrama();
            cyclicBarrier.await();
            this.tirarPo();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(4);
            final CyclicBarrier cyclicBarrier = new CyclicBarrier(4,
                    () -> System.out.println("Agora ir pra dentro e tirar o pó!"));
            final CasaManager manager = new CasaManager();
            for (int i = 0; i < 4; i++) {
                executorService.submit(() -> {
                    manager.fazerFaxinaCompleta(cyclicBarrier);
                });
            }
        } finally {
            if (executorService != null) {
                executorService.shutdown();
            }
        }

    }

}
