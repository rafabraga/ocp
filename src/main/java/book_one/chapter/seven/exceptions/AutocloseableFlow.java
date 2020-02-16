package book_one.chapter.seven.exceptions;

import java.io.Closeable;

public class AutocloseableFlow {
	static class Door implements AutoCloseable {
		@Override
		public void close() {
			System.out.print("D");
		}
	}

	static class Window implements Closeable {
		@Override
		public void close() {
			System.out.print("W");
			throw new RuntimeException();
		}
	}

	public static void main(final String[] args) {
		try (Door d = new Door(); Window w = new Window()) {
			System.out.print("T");
		} catch (final Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
	}
}
