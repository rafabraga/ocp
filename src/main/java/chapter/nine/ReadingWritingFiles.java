package chapter.nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingWritingFiles {

	public static void main(final String[] args) {
		final Path arquivoLer = Paths
				.get("/Users/rafael/Documents/workspace_ocp/ocp/src/main/java/chapter/ten/path/testes.txt");
		final Path arquivoSalvar = Paths.get("/Users/rafael/Desktop/bkp_testes.txt");
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoLer.toFile()));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoSalvar.toFile()))) {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.print(line);
				bufferedWriter.write(line);
			}
		} catch (final Exception e) {

		}
	}

}
