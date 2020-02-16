package book_one.chapter.two.inheritance;

import java.util.Arrays;

public class Inheritance {

	public static void main(final String[] args) {

		final Integer[] inteiros = { 1, 2, 3 };

		final int index = Arrays.binarySearch(inteiros, new Integer(2));
		System.out.println("index: " + index);

	}

}
