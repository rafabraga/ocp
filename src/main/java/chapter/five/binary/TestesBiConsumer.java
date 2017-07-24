package chapter.five.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class TestesBiConsumer {

	public static void main(final String[] args) {
		final BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		final List<Integer> aList = new ArrayList<>();
		listAddElement.accept(aList, 10);
		System.out.println(aList);
	}

}
