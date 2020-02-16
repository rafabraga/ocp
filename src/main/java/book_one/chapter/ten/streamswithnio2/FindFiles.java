package book_one.chapter.ten.streamswithnio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class FindFiles {

	public static void main(final String[] args) {
		final BiPredicate<Path, BasicFileAttributes> predicate = (path, attrs) -> attrs.isRegularFile()
				&& path.toString().endsWith("class");
		try (Stream<Path> entries = Files.find(Paths.get("/Users/rafael/Documents/workspace_ocp/"), 10, predicate)) {
			entries.limit(100).forEach(System.out::println);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
