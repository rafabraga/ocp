package chapter.five.binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class TestesBiPredicate {

	public static void main(final String[] args) {
		final BiPredicate<List<Integer>, Integer> listContains = List::contains;
		final List<Integer> aList = Arrays.asList(10, 20, 30);
		System.out.println(listContains.test(aList, 20));
	}

}
