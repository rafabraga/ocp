package book_one.chapter.nine.console;

import java.io.IOException;

public class Read {

	public static void main(final String[] args) {
		System.out.print("Type a character: ");
		int val = 0;
		try {
			// the return type of read is int, but it returns a byte value!
			val = System.in.read();
		} catch (final IOException ioe) {
			System.err.println("Cannot read input " + ioe);
			System.exit(-1);
		}
		System.out.println("You typed: " + val);
	}

}
