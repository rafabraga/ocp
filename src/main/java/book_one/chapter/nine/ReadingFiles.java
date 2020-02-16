package book_one.chapter.nine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFiles {

	public static void main(final String[] args) throws IOException {
		final Path pathArquivo = Paths
				.get("/Users/rafael/Documents/workspace_ocp/ocp/src/main/java/chapter/ten/path/testes.txt");
		final List<String> lines = Files.readAllLines(pathArquivo);
		lines.forEach(System.out::println);

		Files.lines(pathArquivo).forEach(System.out::println);

		try {
			Files.readAllLines(pathArquivo);
			if (null instanceof Object) {
				System.out.println("?");
			}
		} catch (final IOException e) {
			throw e;
		}
	}

}
