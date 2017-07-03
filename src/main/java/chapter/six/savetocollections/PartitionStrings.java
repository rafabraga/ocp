package chapter.six.savetocollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionStrings {

	public static void main(final String[] args) {
		final String[] string = "you never know what you have until you clean your room".split(" ");
		final Stream<String> distinctWords = Arrays.stream(string).distinct();
		final Map<Boolean, List<String>> wordBlocks = distinctWords
				.collect(Collectors.partitioningBy(str -> str.length() > 4));
		System.out.println("Short words (len <= 4): " + wordBlocks.get(false));
		System.out.println("Long words (len > 4): " + wordBlocks.get(true));

		final Map<Boolean, List<Integer>> inteiros = Stream.of(-3, -1, 2, 5)
				.collect(Collectors.partitioningBy(numero -> numero > 0));
		System.out.println(inteiros.get(true));
		System.out.println(inteiros.get(false));
	}

}
