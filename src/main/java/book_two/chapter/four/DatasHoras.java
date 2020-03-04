package book_two.chapter.four;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * Os objetos dessas classes de data e hora são imutáveis.
 *
 * ZonedDateTimes utilizam o ZoneRules na hora de fazer ajustes. Para criar uma
 * datahora com timezone que não use o ZoneRules, existe a OffsetDateTime.
 *
 * @author rafael
 *
 */
public class DatasHoras {

	public static void main(final String[] args) {

		/**
		 * LocalDate e LocalTime
		 */
		final LocalDate dataAgora = LocalDate.now();

		final LocalDate dataParse = LocalDate.parse("2020-02-23");

		final LocalTime horaParse = LocalTime.parse("11:00:00");

		final LocalTime horaOf = LocalTime.of(11, 05, 00);

		/**
		 * DateTimeFormatter
		 */
		final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		final LocalDateTime dataHoraParse = LocalDateTime.parse("23-02-2020 11:14", dateTimeFormatter);

		final LocalDateTime dataHoraAgora = LocalDateTime.now();

		System.out.println(dateTimeFormatter.format(dataHoraAgora));
		System.out.println(dataHoraParse);
		System.out.println(dataHoraAgora.format(dateTimeFormatter));
		System.out.println(
				dataHoraAgora.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.UK)));

		/**
		 * ZonedDateTime
		 */
		final ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT-3"));

		System.out.println(zonedDateTime);

		System.out.println("Era horário de verão no dia 01/01/2020? " + ZoneId.systemDefault().getRules()
				.isDaylightSavings(ZonedDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneId.systemDefault()).toInstant()));

		final ZonedDateTime proximaQuinta = zonedDateTime.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println("Próxima quinta: " + proximaQuinta);

		System.out.println(ZonedDateTime.parse("2020-05-04T08:00:00"));

		/**
		 * Period
		 */
		final Period periodoUmMes = Period.ofMonths(1);
		final ZonedDateTime zonedDateTimeUmMesAtras = zonedDateTime.minus(periodoUmMes);
		System.out.println("zonedDateTimeUmMesAtras: " + zonedDateTimeUmMesAtras);

		// ZoneId.getAvailableZoneIds().stream().filter(z ->
		// z.startsWith("America")).sorted().forEach(System.out::println);

		final ZonedDateTime zonedDateTimeAcre = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Rio_Branco"));
		System.out.println(zonedDateTimeAcre);

		/**
		 * Duration
		 */
		final LocalDateTime dataHoraAgoraPlus2Horas = dataHoraAgora.plusHours(2);
		System.out.println(ChronoUnit.DAYS.between(dataHoraAgora, dataHoraAgoraPlus2Horas));
		System.out.println(ChronoUnit.HOURS.between(dataHoraAgora, dataHoraAgoraPlus2Horas));
		System.out.println(ChronoUnit.MINUTES.between(dataHoraAgora, dataHoraAgoraPlus2Horas));
		final Duration duasHoras = Duration.ofHours(2);

		final LocalDateTime dataHoraAgoraPlus2HorasDuration = dataHoraAgora.plus(duasHoras);

		/**
		 * Instant
		 */
		final Instant instanteAgora = Instant.now();
		final Instant zonedDateTimeToInstant = zonedDateTime.toInstant();
		final long minutosEntreFusos = ChronoUnit.MINUTES.between(zonedDateTimeToInstant, zonedDateTimeAcre);
		final Duration durationMinutosEntreFusos = Duration.ofMinutes(minutosEntreFusos);

		/**
		 * Etc.
		 */
		System.out.println("É ano bissexto? " + zonedDateTime.toLocalDate().isLeapYear());
		System.out.println("É ano bissexto? " + Year.of(2024).isLeap());

	}

}
