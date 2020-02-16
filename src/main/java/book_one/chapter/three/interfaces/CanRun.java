package book_one.chapter.three.interfaces;

public interface CanRun {

	public default void walk() {
		System.out.println("Walking");
	}

	public abstract void run();

}
