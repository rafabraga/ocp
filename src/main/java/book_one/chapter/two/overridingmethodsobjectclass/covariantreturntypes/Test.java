package book_one.chapter.two.overridingmethodsobjectclass.covariantreturntypes;

class Test {
	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		final Circle c1 = new Circle(10, 20, 30);
		final Circle c2 = (Circle) c1.copy(); // É necessário um cast explícito!

		/**
		 * Se o retorno de copy() fosse do tipo Circle(), haveria a sobrescrita
		 * e não seria necessário o cast!
		 */
	}
}
