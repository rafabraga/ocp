package book_one.chapter.five.primitive;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class TestesPrimitiveFunction {

	public static void main(final String[] args) {
		/*
		 * Pág. 156 para todas as versões primitivas.
		 */
		final AtomicInteger ints = new AtomicInteger(0);
		IntStream.generate(ints::incrementAndGet).limit(10).forEach(System.out::println);

		final IntFunction<Integer> absInt = Math::abs;
		IntStream.of(-9, -16).mapToObj(absInt).forEach(System.out::println);
	}

}
