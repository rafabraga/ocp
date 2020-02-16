package book_one.chapter.ten.path.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Map;

public class FileAttributes {

	public static void main(final String[] args) throws IOException {
		final Path path = Paths.get("./Test");
		final Map<String, Object> atributos = Files.readAttributes(path, "*");
		atributos.entrySet().stream().forEach(System.out::println);

		System.out.println("----");

		final BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("File size: " + fileAttributes.size());
		System.out.println("isDirectory: " + fileAttributes.isDirectory());
		System.out.println("isRegularFile: " + fileAttributes.isRegularFile());
		System.out.println("isSymbolicLink: " + fileAttributes.isSymbolicLink());
		System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
		System.out.println("File last modified time: " + fileAttributes.lastModifiedTime());
		System.out.println("File creation time: " + fileAttributes.creationTime());

		System.out.println("----");

		final UserPrincipal owner = Files.getOwner(path);
		System.out.println(owner);
	}

}
