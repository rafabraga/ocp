package chapter.ten.path.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare2 {

	public static void main(final String[] args) throws IOException {
		final Path path1 = Paths.get("/Users/rafael/Documents/workspace_ocp/ocp/Test");
		final Path path2 = Paths.get("./Test");
		System.out.println("Mesmo path: " + Files.isSameFile(path1, path2));

		System.out.println("É um diretório: " + Files.isDirectory(path2));
		System.out.printf("Readable: %b, Writable: %b, Executable: %b %n", Files.isReadable(path2),
				Files.isWritable(path2), Files.isExecutable(path2));
	}

}
