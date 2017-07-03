package chapter.six.savetocollections;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsToList {

	public static void main(final String[] args) {
		final String frenchCounting = "un:deux:trois:quatre";
		final List<String> gmailList = Pattern.compile(":").splitAsStream(frenchCounting).collect(Collectors.toList());
		gmailList.forEach(System.out::println);
	}

}
