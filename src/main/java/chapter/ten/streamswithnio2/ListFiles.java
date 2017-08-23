package chapter.ten.streamswithnio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFiles {

	public static void main(final String[] args) throws IOException {
		final Stream<Path> entries = Files.list(Paths.get("."));
		entries.map(path -> path.toAbsolutePath()).forEach(System.out::println);
		entries.close();
	}

}
