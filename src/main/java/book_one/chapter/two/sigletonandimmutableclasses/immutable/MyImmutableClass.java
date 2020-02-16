package book_one.chapter.two.sigletonandimmutableclasses.immutable;

public final class MyImmutableClass {

	private final String value;

	public MyImmutableClass(final String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public String concat(final String valueToConcat) {
		return this.value + valueToConcat;
	}

}
