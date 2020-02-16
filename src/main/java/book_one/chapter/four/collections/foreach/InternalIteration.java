package book_one.chapter.four.collections.foreach;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	public static void main(final String[] args) {
		final List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo", "mo");
		strings.forEach(string -> System.out.println(string));

		System.out.println("-----");

		strings.forEach(System.out::println);

		System.out.println("-----");

		strings.stream().distinct().forEachOrdered(System.out::println);
	}

}
