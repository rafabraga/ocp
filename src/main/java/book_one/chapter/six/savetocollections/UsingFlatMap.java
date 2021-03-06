package book_one.chapter.six.savetocollections;

import java.util.Arrays;
import java.util.List;

public class UsingFlatMap {

	public static void main(final String[] args) {
		final List<List<Integer>> intsOfInts = Arrays.asList(Arrays.asList(1, 3, 5), Arrays.asList(2, 4));
		intsOfInts.stream().flatMap(ints -> ints.stream()).sorted().map(i -> i * i).forEach(System.out::println);
	}

}
