package book_one.chapter.three.interfaces;

public interface CanWalk {

	default void walk() {
		System.out.println("Walking");
	}

}
