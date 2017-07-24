package chapter.eleven.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWList {

	public static void main(final String[] args) {
		final List<String> aList = new CopyOnWriteArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		final Iterator<String> listIter = aList.iterator();
		while (listIter.hasNext()) {
			aList.remove(0);
			System.out.println(listIter.next());
			aList.add("four");
		}
		System.out.println(aList);
	}

}
