package chapter.ten.path.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(final String[] args) throws IOException {
		final Path source = Paths.get("/Users/rafael/Documents/workspace_ocp/ocp/Test/");
		final Path target = Paths.get("/Users/rafael/Desktop/Test/");

		// Quando se copia um diretório, os seus arquivos não são copiados
		// junto!
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
	}

}
