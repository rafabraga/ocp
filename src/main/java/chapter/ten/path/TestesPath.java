package chapter.ten.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestesPath {

	public static void main(final String[] args) throws IOException {
		final Path pathWorkspace = Paths.get("/Users/rafael/Documents/workspace_ocp/");
		final Path pathArquivo = Paths.get("ocp/src/main/java/chapter/ten/path/testes2.txt");
		final Path pathResolvido = pathWorkspace.resolve(pathArquivo);
		System.out.println("Path resolvido: " + pathResolvido);

		final Path pathArquivo2 = Paths.get("src/main/java/chapter/ten/path/testes2.txt");
		System.out.println(Files.exists(pathArquivo2));
		System.out.println(Files.isSameFile(pathResolvido,
				Paths.get("/Users/rafael/Documents/workspace_ocp/ocp/src/main/java/chapter/ten/path/testes2.txt")));
		System.out.println("Path resolvido real: " + pathResolvido.toRealPath());
	}

}
