package book_one.chapter.six.dataandcalculation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class DataAndCalculation {

	public static void main(final String[] args) {
		final String[] arrayString = "one two three four five".split(" ");
		final Optional<String> minString = Arrays.stream(arrayString).min(String::compareTo);
		System.out.println(minString.get());

		final Comparator<String> lengthComparator = (str1, str2) -> str1.length() - str2.length();
		System.out.println(Arrays.stream(arrayString).min(lengthComparator).get());

	}

}
