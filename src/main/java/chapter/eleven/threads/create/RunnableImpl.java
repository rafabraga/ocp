package chapter.eleven.threads.create;

public class RunnableImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("In run(); thread name is: " + Thread.currentThread().getName());
	}

	public static void main(final String[] args) {
		final Thread myThread = new Thread(new RunnableImpl());
		myThread.start();
		System.out.println("In main(); thread name is: " + Thread.currentThread().getName());
	}

}
