package book_one.chapter.ten.streamswithnio2;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CountEntriesRecur {

	public static void main(final String[] args) {
		try (Stream<Path> entries = Files.walk(Paths.get("."), 3, FileVisitOption.FOLLOW_LINKS)) {
			final long numOfEntries = entries.count();
			System.out.printf("Found %d entries in the current path", numOfEntries);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
