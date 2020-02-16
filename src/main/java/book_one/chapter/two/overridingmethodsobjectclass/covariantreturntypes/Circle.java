package book_one.chapter.two.overridingmethodsobjectclass.covariantreturntypes;

class Circle extends Shape {

	public Circle(final int x, final int y, final int radius) {
		/* initialize fields here */ }

	@Override
	public Shape copy() {
		// TODO Auto-generated method stub
		return null;
	}

	void test(final String s) {
		System.out.println("In method test().");
	}
	// other methods elided
}
