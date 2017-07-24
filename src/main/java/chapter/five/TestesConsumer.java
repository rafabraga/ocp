package chapter.five;

import java.util.function.Consumer;

public class TestesConsumer {

	public static void main(final String[] args) {
		/*
		 * Um consumer<T> recebe um argumento do tipo T e não retorna nada.
		 */
		final Consumer<String> printUpper = arg -> System.out.println(arg.toUpperCase());
		printUpper.accept("olá");
	}

}
