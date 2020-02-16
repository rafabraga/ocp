package book_one.chapter.four.collections.arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestIterator {

	public static void main(final String[] args) {
		final List<Integer> nums = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

		System.out.println("Original list " + nums);
		final Iterator<Integer> numsIter = nums.iterator();
		while (numsIter.hasNext()) {
			numsIter.next(); // Se não chamar o next(), dá erro!
			numsIter.remove();
		}
		System.out.println("List after removing all elements" + nums);
	}

}
