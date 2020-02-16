package book_one.chapter.ten.streamswithnio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lines {

	public static void main(final String[] args) throws IOException {
		final Path path = Paths.get("./Test/bkp_log.txt");
		Files.lines(path).limit(1).forEach(System.out::println);
	}

}
