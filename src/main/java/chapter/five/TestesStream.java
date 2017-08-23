package chapter.five;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestesStream {

	public static void main(final String[] args) {
		Stream.generate(Math::random).limit(5).map(x -> x * 10).sorted().map((final Double x) -> x.intValue() * 10)
				.forEach(System.out::println);

		final IntStream intStream = IntStream.iterate(1, n -> n + 1).limit(5);
		System.out.println("Count da intStream: " + intStream.count());
		System.out.println("Sum da intStream: " + intStream.sum());
	}

}
