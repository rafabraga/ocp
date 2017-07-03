package chapter.nine.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read2 {

	public static void main(final String[] args) {
		System.out.print("Type a character: ");
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			// the return type of read is int, but it returns a byte value!
			str = br.readLine();
		} catch (final IOException ioe) {
			System.err.println("Cannot read input " + ioe);
			System.exit(-1);
		}
		System.out.println("You typed: " + str);
	}

}
