package book_two.chapter.four;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Locales {

	public static void main(final String[] args) {
		final Locale localeItalia = new Locale("it", "IT");
		final Locale localePtBr = new Locale("pt", "BR");
		final Locale localeJapao = new Locale("ja", "JP");

		final LocalDateTime dateTime = LocalDateTime.now();
		System.out
				.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(localeItalia)));
		System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(localePtBr)));
		System.out
				.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(localeJapao)));

		System.out.println("\n" + localeItalia.getDisplayCountry());
		System.out.println(localeItalia.getDisplayCountry(localeItalia));
		System.out.println(localeItalia.getDisplayLanguage());
		System.out.println(localeItalia.getDisplayLanguage(localeItalia));

		System.out.println("\n" + localePtBr.getDisplayCountry());
		System.out.println(localePtBr.getDisplayCountry(localePtBr));
		System.out.println(localePtBr.getDisplayLanguage());
		System.out.println(localePtBr.getDisplayLanguage(localePtBr));

		System.out.println("\n" + localeJapao.getDisplayCountry());
		System.out.println(localeJapao.getDisplayCountry(localeJapao));
		System.out.println(localeJapao.getDisplayLanguage());
		System.out.println(localeJapao.getDisplayLanguage(localeJapao));
	}

}
