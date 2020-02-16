package book_one.chapter.six.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class OptionalTests {

    public static void main(final String[] args) {
        // final IntStream intStream = IntStream.empty();
        // System.out.println(intStream.average().getAsDouble());

        // System.out.println(Optional.empty().get());

        final OptionalDouble max = DoubleStream.of(2.0, 4.5, 3.0).max();
        System.out.println(max.getAsDouble());

        final Optional<Double> optionalGenerico = Stream.of(1.2, 3.4, 2.3).max(Double::compareTo);
        optionalGenerico.ifPresent(System.out::println);

        final Optional<String> empty = Optional.empty();
        System.out.println("-> " + empty);
        empty.ifPresent(System.out::println);

        final Optional<String> nullableStr = Optional.ofNullable(null);
        System.out.println(nullableStr);

        final Optional<String> oneString = Optional.ofNullable(null);
        System.out.println("or else: " + oneString.map(String::length).orElse(-1));
        System.out.println("or else throw: " + oneString.map(String::trim).orElseThrow(IllegalArgumentException::new));
    }

}
