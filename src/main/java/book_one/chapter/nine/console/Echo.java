package book_one.chapter.nine.console;

import java.io.Console;

public class Echo {

	public static void main(final String[] args) {
		// get the System console object
		final Console console = System.console();
		if (console == null) {
			System.err.println(
					"Cannot retrieve console object - are you running your application from an IDE? Exiting the application ... ");
			System.exit(-1); // terminate the application
		}
		// read a line and print it through printf
		console.printf(console.readLine());
	}

}
