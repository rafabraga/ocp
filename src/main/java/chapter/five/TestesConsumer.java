package chapter.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class TestesConsumer {

    public static void main(final String[] args) {
        /*
         * Um consumer<T> recebe um argumento do tipo T e não retorna nada.
         */
        final Consumer<String> printUpper = arg -> System.out.println(arg.toUpperCase());
        printUpper.accept("olá");

        final Consumer<Object> consumer1 = System.out::println;
        final Consumer<String> consumer2 = String::new;
        final Consumer<ArrayList> consumer3 = ArrayList::new;
        final Consumer<String> consumer4 = r -> System.out.println(r);

        Arrays.asList("dia").stream().peek(consumer1).findFirst();
    }

}
