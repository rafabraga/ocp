package chapter.five;

import java.util.Arrays;
import java.util.function.Function;

public class TestesFunction {

    public static void main(final String[] args) {
        /*
         * Function<T, R> recebe um argumento do tipo T e retorna um valor do tipo R.
         */
        final Function<String, Integer> parseInt = Integer::parseInt;
        final Function<Integer, Integer> absInt = Math::abs;
        // O andThen aqui faz com que absInt seja executado depois de parseInt.
        // Existe também um compose(), que faz o contrário...
        final Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
        Arrays.stream("4, -9, 16".split(", ")).map(parseAndAbsInt).forEach(System.out::println);

        // final DoubleToLongFunction doubleToLongFunction = (final Double d) ->
        // d.longValue();

    }

}
