package book_one.chapter.five.binary;

import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

public class TestesBiFunction {

	public static void main(final String[] args) {
		final BiFunction<String, String, String> concatStr = (x, y) -> x + y;
		System.out.println(concatStr.apply("hello ", "world"));

		final BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
		System.out.println(compareDoubles.apply(10.0, 10.0));

		final ToIntBiFunction<Double, Double> compare = Double::compare;
		System.out.println(compare.applyAsInt(11.0, 10.0));
	}

}
