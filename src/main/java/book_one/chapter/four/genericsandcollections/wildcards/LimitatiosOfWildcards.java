package book_one.chapter.four.genericsandcollections.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LimitatiosOfWildcards {

	public static void main(final String[] args) {
		final List<?> wildCardList = new ArrayList<Integer>();
		// wildCardList.add(new Integer(10));
		System.out.println(wildCardList);

		/**
		 * O compilador não permite métodos que modifiquem o objeto, como o
		 * add().
		 */
	}

}
