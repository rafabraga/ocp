package book_one.chapter.eight;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTests {

	public static void main(final String[] args) {
		final LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		final LocalDate hoje2 = LocalDate.now(Clock.systemDefaultZone());
		System.out.println(hoje2);

		final LocalDate hoje3 = LocalDate.now(ZoneId.systemDefault());
		System.out.println(hoje3);

		final LocalDate dia25Janeiro2017 = LocalDate.ofYearDay(2017, 25);
		System.out.println(dia25Janeiro2017);

		final LocalDate natal = LocalDate.parse("2017-12-25");
		System.out.println(natal);

		final LocalDate natalFormatado = LocalDate.parse("2017-12-25");
		System.out.println(natalFormatado.format(DateTimeFormatter.ofPattern("dd/MM/yyyy E (EEEE)")));

		final DateTimeFormatter formatoPadrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatoPadrao.format(natal));

		final LocalDate epochDay = LocalDate.ofEpochDay(365L);
		System.out.println(epochDay);
	}

}
