package chapter.six.searchdata;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Tests {

	public static void main(final String[] args) {
		final boolean anyMatch = IntStream.of(-10, -5, 0, 1, 4, 8).map(i -> i - 20).anyMatch(i -> i > 0);
		System.out.println(anyMatch);

		final boolean allMatch = IntStream.of(-10, -5, 0, 1, 4, 8).allMatch(i -> i > 0);
		System.out.println(allMatch);

		final boolean noneMatch = IntStream.of(-10, -5, 0, 1, 4, 8).allMatch(i -> i > 0);
		System.out.println(noneMatch);

		Arrays.stream(new String[] { "abc", "def", "cbf" }).filter(name -> name.endsWith("f")).sorted()
				.forEach(System.out::println);

		final Optional<String> first = Arrays.stream(new String[] { "abc", "def", "cbf" })
				.filter(name -> name.endsWith("g")).sorted().findFirst();
		System.out.println(first.orElse("Nada encontrado."));

		final OptionalInt optionalInt = IntStream.rangeClosed(-10, 10).map(i -> i * 2).filter(i -> i > 0).findFirst();
		System.out.println(optionalInt.orElse(-1));

	}

}
