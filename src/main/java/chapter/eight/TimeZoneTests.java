package chapter.eight;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimeZoneTests {

	public static void main(final String[] args) {
		final Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println("Number of available time zones is: " + zones.size());
		// zones.forEach(System.out::println);

		final ZonedDateTime zonedAcre = ZonedDateTime.now(ZoneId.of("Brazil/Acre"));
		System.out.println(zonedAcre);

		final ZonedDateTime zonedBrasilia = ZonedDateTime.now(ZoneId.of("Brazil/East"));
		System.out.println(zonedBrasilia);

		final Duration diferenca = Duration.between(zonedAcre.toLocalTime(), zonedBrasilia.toLocalTime());
		System.out.println(diferenca.toHours());

	}

}
