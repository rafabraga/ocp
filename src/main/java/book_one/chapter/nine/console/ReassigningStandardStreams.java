package book_one.chapter.nine.console;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReassigningStandardStreams {

	public static void main(final String[] args) {
		try {
			final PrintStream printStream = new PrintStream("log.txt");
			System.setOut(printStream);
			System.out.println("Testando o log em arquivo.");
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
