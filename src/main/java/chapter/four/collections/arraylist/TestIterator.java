package chapter.four.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

	public static void main(final String[] args) {
		final ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			nums.add(i);
		}
		System.out.println("Original list " + nums);
		final Iterator<Integer> numsIter = nums.iterator();
		while (numsIter.hasNext()) {
			numsIter.next(); // Se não chamar o next(), dá erro!
			numsIter.remove();
		}
		System.out.println("List after removing all elements" + nums);
	}

}
