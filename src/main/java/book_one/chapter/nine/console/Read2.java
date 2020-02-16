package book_one.chapter.nine.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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

		final Scanner scanner = new Scanner(System.in);
		System.out.print("Type another character: ");
		final String inputStr = scanner.next();
		scanner.close();
		System.out.println("You typed: " + inputStr);
	}

}
