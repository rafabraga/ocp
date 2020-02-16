package book_one.chapter.three.interfaces;

public interface CanSprint extends CanRun, CanWalk {

	void sprint();

	@Override
	default void walk() {
		// TODO Auto-generated method stub
		CanRun.super.walk();
	}

}
