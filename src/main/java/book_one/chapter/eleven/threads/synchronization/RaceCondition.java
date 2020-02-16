package book_one.chapter.eleven.threads.synchronization;

public class RaceCondition {

	public static void main(final String args[]) {
		final UseCounter c = new UseCounter();
		final Thread t1 = new Thread(c);
		final Thread t2 = new Thread(c);
		final Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}

}
