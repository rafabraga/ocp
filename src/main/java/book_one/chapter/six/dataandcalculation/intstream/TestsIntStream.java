package book_one.chapter.six.dataandcalculation.intstream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TestsIntStream {

	public static void main(final String[] args) {
		final int sum = IntStream.of(1, 2, 4, 6, 10).sum();
		System.out.println(sum);

		final long count = IntStream.of(1, 2, 4, 6, 10).count();
		System.out.println(count);

		final OptionalDouble average = IntStream.of(1, 2, 4, 6, 10).average();
		System.out.println(average.getAsDouble());

		final OptionalInt optionalIntMin = IntStream.of(1, 2, 4, 6, 10).min();
		System.out.println(optionalIntMin.getAsInt());

		final OptionalInt optionalIntMax = IntStream.of(1, 2, 4, 6, 10).max();
		System.out.println(optionalIntMax.getAsInt());

		final IntSummaryStatistics summary = IntStream.of(1, 2, 4, 6, 10).summaryStatistics();
		System.out.println(summary);

		System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
	}

}
