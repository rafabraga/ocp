package book_one.chapter.five;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestesSupplier {

	public static void main(final String[] args) {
		/*
		 * Supplier<T> não recebe argumento mas retorna um valor do tipo T.
		 */
		final Random random = new Random();
		Stream.generate(random::nextBoolean).limit(5).forEach(System.out::println);

		final Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
		System.out.println(currentDateTime.get());
	}

}
