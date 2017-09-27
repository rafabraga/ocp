package chapter.five;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;

public class TestesConstructorReferences {

    public static void main(final String[] args) {
        final Supplier<String> newString = String::new;
        System.out.println(newString.get());

        final Supplier<String> newString2 = () -> new String();
        System.out.println(newString2.get());

        final Function<String, Integer> anotherInteger = Integer::new;
        System.out.println(anotherInteger.apply("100"));

        final ToDoubleBiFunction<String, String> toDouble = (x, y) -> x.length() + y.length();
        System.out.println(toDouble.applyAsDouble("um", "dois"));

        final Double doub = (double) 2L;

    }

}
