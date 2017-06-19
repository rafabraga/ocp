package chapter.four.collections.foreach.streams;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void printUpperCaseString(final String string) {
		System.out.println(string.toUpperCase());
	}

	public static void main(final String[] args) {
		final List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(MethodReference::printUpperCaseString);
	}

}
