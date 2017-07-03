package chapter.eight;

import java.time.LocalTime;

public class LocalTimeTests {

	public static void main(final String[] args) {

		final LocalTime agora = LocalTime.now();
		System.out.println(agora);

		final LocalTime noon = LocalTime.NOON;
		System.out.println(noon);

		final LocalTime almoco11e30 = LocalTime.of(11, 30);
		System.out.println(almoco11e30);
	}

}
