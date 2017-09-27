package chapter.eleven.tests;

public class MyFirstRunnable implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("i = " + i++);
		}

	}

	public static void main(final String[] args) throws InterruptedException {
		final MyFirstRunnable run1 = new MyFirstRunnable();
		final Thread thread1 = new Thread(run1);
		final Thread thread2 = new Thread(run1);
		final Thread thread3 = new Thread(() -> {
			int i = 0;
			while (i < 10) {
				System.out.println("i = " + i++);
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
