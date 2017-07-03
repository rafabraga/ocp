package chapter.six.sortcollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingCollections {

	public static void main(final String[] args) {
		final List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
		words.stream().distinct().sorted().forEach(System.out::println);

		System.out.println("---");

		final Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
		words.stream().distinct().sorted(lengthCompare).forEach(System.out::println);

		System.out.println("---");

		words.stream().distinct().sorted(lengthCompare.thenComparing(String::compareTo)).forEach(System.out::println);

		System.out.println("---");

		words.stream().distinct().sorted(lengthCompare.thenComparing(String::compareTo).reversed())
				.forEach(System.out::println);

	}

}
