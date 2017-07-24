package chapter.five.primitive;

import java.util.function.IntPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class TestesPrimitivePredicate {

	public static void main(final String[] args) {
		/*
		 * int, long e double predicates.
		 */
		final IntPredicate evenNums = i -> i % 2 == 0;
		IntStream.range(1, 10).filter(evenNums).forEach(System.out::println);

		final long doubleCount = DoubleStream.of(1.0, 2.0, 4.0).filter(i -> i < 4).count();
		System.out.printf("%n" + doubleCount);
	}

}
