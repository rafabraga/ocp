package chapter.eleven.parallelstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamTests {

    public static void main(final String[] args) {
        final Stream<String> parallelStream1 = Stream.of("a", "b", "c", "d", "e").parallel();

        final Stream<Integer> parallelStream2 = Arrays.asList(1, 2, 3, 4, 5).parallelStream();

        parallelStream1.skip(2).limit(2).forEach(System.out::println);
        // O findFirst() obriga a stream paralela a ser ordenar.
        System.out.println(parallelStream2.skip(2).limit(2).findFirst().get());
    }

}
