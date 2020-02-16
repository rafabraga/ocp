package book_one.chapter.eleven.threads.synchronization;

public class UseCounter implements Runnable {

	public synchronized void increment() {
		// increments the counter and prints the value of the counter shared
		// between threads
		Counter.count++;
		System.out.print(Counter.count + " ");

		// Podemos criar um bloco sincronizado...
		// synchronized (this) {
		// Counter.count++;
		// System.out.print(Counter.count + " ");
		// }
	}

	@Override
	public void run() {
		this.increment();
		this.increment();
		this.increment();
	}

}
