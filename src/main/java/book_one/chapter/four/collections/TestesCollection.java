package book_one.chapter.four.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class TestesCollection {

	public static void main(final String[] args) {
		final Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		final List<Integer> lista = stream.collect(Collectors.toList());
		System.out.println(lista);

		System.out.println(Stream.of(1, 2, 3, 4, 5).map(x -> "" + x).collect(Collectors.joining(", ")));

		final Stream<Integer> s = Stream.of(1);
		// final IntStream is = s.mapToInt(x -> x);
		final DoubleStream ds = s.mapToDouble(x -> x);
		// final Stream<Integer> s2 = ds.mapToInt(x -> x);
		ds.forEach(System.out::print);

	}

}
