package book_one.chapter.four.genericsandcollections.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {

	static void printList(final List<?> list) {
		for (final Object element : list) {
			System.out.println("[" + element + "]");
		}
	}

	public static void main(final String[] args) {
		final List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		printList(list);
		final List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		printList(strList);
	}

}
