package book_one.chapter.eleven.tests;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reduce {

    public static void main(final String[] args) {
        System.out
                .println(Arrays.asList('w', 'o', 'l', 'f').stream().reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));

        System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce(" - ", String::concat));

        final Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        final ConcurrentMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingByConcurrent(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

}
