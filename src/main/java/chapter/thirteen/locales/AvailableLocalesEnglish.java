package chapter.thirteen.locales;

import java.util.Arrays;
import java.util.Locale;

public class AvailableLocalesEnglish {

	public static void main(final String[] args) {
		Arrays.stream(Locale.getAvailableLocales()).filter(locale -> locale.getLanguage().equals("en"))
				.forEach(locale -> System.out.printf("Locale code: %s and it stands for %s %n", locale,
						locale.getDisplayName()));

		System.out.println(Locale.GERMANY.getDisplayCountry());
		System.out.println(Locale.GERMANY.getDisplayCountry(Locale.ENGLISH));
	}

}
