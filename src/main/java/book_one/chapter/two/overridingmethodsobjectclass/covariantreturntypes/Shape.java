package book_one.chapter.two.overridingmethodsobjectclass.covariantreturntypes;

abstract class Shape {
	// other methods elided
	public abstract Shape copy();

	static void test() {
		System.out.println("In method test().");
	}
}
