package book_one.chapter.thirteen.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {

	public static void main(final String[] args) {
		final Locale currentLocale = Locale.CHINA;
		Locale.setDefault(Locale.ENGLISH);
		final ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
		System.out.printf(resBundle.getString("Greeting_2"));

	}

}
