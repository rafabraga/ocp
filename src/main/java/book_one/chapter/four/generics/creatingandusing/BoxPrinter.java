package book_one.chapter.four.generics.creatingandusing;

public class BoxPrinter<T> {

	private final T val;

	public BoxPrinter(final T arg) {
		this.val = arg;
	}

	@Override
	public String toString() {
		return "[" + this.val + "]";
	}

}
