package book_one.chapter.seven.exceptions;

public class Auto implements AutoCloseable {
	int num;

	Auto(final int num) {
		this.num = num;
	}

	@Override
	public void close() {
		System.out.println("Close: " + this.num);
	}

	public static void main(final String[] args) {
		try (Auto a1 = new Auto(1); Auto a2 = new Auto(2)) {
			throw new RuntimeException();
		} catch (final Exception e) {
			System.out.println("ex");
		} finally {
			System.out.println("finally");
		}
	}
}