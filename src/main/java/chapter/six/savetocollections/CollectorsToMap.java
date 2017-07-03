package chapter.six.savetocollections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMap {

	public static void main(final String[] args) {
		final Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
				.collect(Collectors.toMap(name -> name, name -> name.length()));
		nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));

		final Map<String, String> nomeUpper = Stream.of("Arnold", "Alois", "Schwarzenegger")
				.collect(Collectors.toMap(Function.identity(), String::toUpperCase));
		nomeUpper.forEach((nome, upper) -> System.out.printf("%s - %s \n", nome, upper));

	}

}
