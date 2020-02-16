package book_one.chapter.seven.exceptions;

class A {
	public static void main(final String[] args) {
		new A().go();
	}

	void go() {
		System.out.print("A ");
		try {
			this.run(0);
			System.out.print("B ");
		} catch (final Exception e) {
			System.out.print("C ");
		} finally {
			System.out.print("D ");
		}
	}

	void run(final int i) {
		try {
			System.out.print("E ");
			final int x = 5 / i;
			System.out.print("F ");
		} catch (final NumberFormatException e2) {
			System.out.print("G ");
		} finally {
			System.out.print("H ");
		}
	}

}