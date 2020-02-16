package book_one.chapter.eleven.threads.create;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			sleep(1000);
		} catch (final InterruptedException ex) {
			ex.printStackTrace();
			// ignore the InterruptedException - this is perhaps the one of the
			// very few of the exceptions in Java which is acceptable to ignore
		}
		System.out.println("In run(); thread name is: " + this.getName());
	}

	public static void main(final String[] args) {
		final Thread myThread = new MyThread();
		myThread.start();
		System.out.println("In main(); thread name: " + Thread.currentThread().getName());
	}

}
