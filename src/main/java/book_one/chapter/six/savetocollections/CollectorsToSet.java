package book_one.chapter.six.savetocollections;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToSet {

	public static void main(final String[] args) {
		final String[] roseQuote = "a rose is a rose is a rose".split(" ");
		final Set<String> words = Stream.of(roseQuote).collect(Collectors.toSet());
		words.forEach(System.out::println);

		// Poderia ter usado Arrays.stream() no lugar do Stream.of().
	}

}
