package book_one.chapter.eight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeTests {

	public static void main(final String[] args) {

		final LocalTime agora = LocalTime.now();
		System.out.println(agora);

		final LocalTime noon = LocalTime.NOON;
		System.out.println(noon);

		final LocalTime almoco11e30 = LocalTime.of(11, 30);
		System.out.println(almoco11e30);

		final DateTimeFormatter formatoHora1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		final DateTimeFormatter formatoHora2 = DateTimeFormatter.ofPattern("KK:mm:ss a");

		System.out.println(agora.format(formatoHora1));
		System.out.println(agora.format(formatoHora2));
	}

}
