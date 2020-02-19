package book_one.chapter.two.sigletonandimmutableclasses.immutable;

public class TestImmutable {

	public static void main(final String[] args) {
		String param = "texto";
		final MyImmutableClass immutable = new MyImmutableClass(param);

		System.out.println(immutable.getValue());
		param += " o o o o o ";
		System.out.println(param);
		System.out.println(immutable.concat("oooo"));
		System.out.println(immutable.getValue());
	}
}
