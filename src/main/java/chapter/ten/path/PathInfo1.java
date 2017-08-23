package chapter.ten.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo1 {

	public static void main(final String[] args) {
		// create a Path object by calling static method get() in Paths class
		final Path testFilePath = Paths.get("/Users/rafael/Documents/workspace_ocp/ocp/testes.txt");
		// retrieve basic information about path
		System.out.println("Printing file information: ");
		System.out.println("\t file name: " + testFilePath.getFileName());
		System.out.println("\t root of the path: " + testFilePath.getRoot());
		System.out.println("\t parent of the target: " + testFilePath.getParent());
		// print path elements
		System.out.print("Printing elements of the path: ");
		System.out.println(testFilePath.getNameCount() + " elements");
		for (final Path element : testFilePath) {
			System.out.println("\t path element: " + element);
		}
		System.out.println(testFilePath.getName(1));
		System.out.println(testFilePath.subpath(2, 3));

	}

}
