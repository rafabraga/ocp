package chapter.two.sigletonandimmutableclasses.immutable;

public class TestImmutable {

	public static void main(final String[] args) {
		final MyImmutableClass immutable = new MyImmutableClass("texto");

		System.out.println(immutable.getValue());
		System.out.println(immutable.concat("oooo"));
		System.out.println(immutable.getValue());
	}
}
