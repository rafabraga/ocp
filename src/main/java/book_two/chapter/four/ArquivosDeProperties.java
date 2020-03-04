package book_two.chapter.four;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ArquivosDeProperties {

	public static void main(final String[] args) {
		final Properties p1 = new Properties();
		p1.setProperty("k1", "v1");
		p1.setProperty("k2", "v2");

		p1.list(System.out);

		try {
			final FileOutputStream out1 = new FileOutputStream("myProps1.props");
			p1.store(out1, "Cabeçalhooo");
			out1.close();
		} catch (final Exception e) {
			System.out.println("Exception 1");
		}

		final Properties p2 = new Properties();
		try {
			final FileInputStream in2 = new FileInputStream("myProps1.props");
			p2.load(in2);
			p2.list(System.out);
			p2.setProperty("k3", "v3");
			p2.list(System.out);
			final FileOutputStream out2 = new FileOutputStream("myProps2.props");
			p2.store(out2, "update");
			in2.close();
			out2.close();
		} catch (final IOException e) {
			System.out.println("Exception 2");
		}
	}

}
