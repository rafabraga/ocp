package chapter.eight;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTests {

	public static void main(final String[] args) {
		final LocalTime tempo1 = LocalTime.of(10, 10);
		final LocalTime tempo2 = LocalTime.of(11, 10);
		final Duration duracao = Duration.between(tempo1, tempo2);

		System.out.println(duracao.toHours());
	}

}
