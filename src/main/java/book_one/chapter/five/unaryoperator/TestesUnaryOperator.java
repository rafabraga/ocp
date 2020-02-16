package book_one.chapter.five.unaryoperator;

import java.util.Arrays;
import java.util.List;

public class TestesUnaryOperator {

	public static void main(final String[] args) {
		final List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
		System.out.println("Before: " + ell);
		ell.replaceAll(Math::abs);
		System.out.println("After: " + ell);

		/*
		 * Há versões primitivas: IntUnaryOperator, LongUnaryOperator e
		 * DoubleUnaryOperator.
		 */
	}

}
