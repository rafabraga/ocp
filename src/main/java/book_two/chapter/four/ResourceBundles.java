package book_two.chapter.four;

import java.util.Locale;
import java.util.ResourceBundle;

// @formatter:off
/**
 * Procurando por um ResourceBundle RB_fr_CA:
 *
 * RB_fr_CA.java
 * RB_fr_CA.properties
 * RB_fr.java
 * RB_fr.properties
 * RB_pt_BR.java
 * RB_pt_BR.properties
 * RB_pt.java
 * RB_pt.properties
 * RB.java
 * RB.properties
 *
 * @author usuario
 *
 */
public class ResourceBundles {

	public static void main(final String[] args) {
		final ResourceBundle rbEn = ResourceBundle.getBundle("ResourceBundle", Locale.forLanguageTag("en"));
		final ResourceBundle rbEnUs = ResourceBundle.getBundle("ResourceBundle", Locale.forLanguageTag("en-US"));
		final ResourceBundle rbEnGb = ResourceBundle.getBundle("ResourceBundle", Locale.forLanguageTag("en-GB"));
		final ResourceBundle rbEnCa = ResourceBundle.getBundle("book_two.chapter.four.ResourceBundle",
				Locale.forLanguageTag("en-CA"));

		System.out.println(rbEn.getString("Greeting"));
//		System.out.println(rbEn.getString("Greeting_en_US"));
		System.out.println(rbEnUs.getString("Greeting"));
		System.out.println(rbEnUs.getString("Greeting_default"));
		System.out.println(rbEnGb.getString("Greeting"));

		System.out.println(rbEnUs.getString("Greeting_en"));

		System.out.println("Hello" + rbEnCa.getObject("Greeting"));

		System.out.println(Locale.getDefault());

	}

}
