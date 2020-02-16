package book_one.chapter.six.savetocollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStringsByLength {

	public static void main(final String[] args) {
		final String[] string = "you never know what you have until you clean your room".split(" ");
		final Stream<String> distinctWords = Arrays.stream(string).distinct();
		final Map<Integer, List<String>> wordGroups = distinctWords.collect(Collectors.groupingBy(String::length));
		wordGroups.forEach((count, words) -> {
			System.out.printf("word(s) of length %d %n", count);
			words.forEach(System.out::println);
		});

		final Map<Character, List<String>> grupos = Arrays.stream(string).distinct().sorted()
				.collect(Collectors.groupingBy(word -> word.charAt(0)));
		grupos.forEach((letra, palavras) -> {
			System.out.printf("Palavras iniciadas com %s: %n", letra);
			palavras.forEach(System.out::println);
		});
	}

}
