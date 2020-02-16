package book_one.chapter.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class TestesPredicate {

	public static void main(final String[] args) {
		/*
		 * Predicate<T> recebe um argumento do tipo T e retorna um boolean.
		 */
		final Predicate<String> nullCheck = Objects::nonNull;
		final Predicate<String> emptyCheck = arg -> arg.length() > 0;
		final Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		final String helloStr = "hello";
		System.out.println(nullAndEmptyCheck.test(helloStr));
		final String nullStr = null;
		System.out.println(nullAndEmptyCheck.test(nullStr));

		final String a = "a";
		final String b = null;
		final List<String> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);

		lista.stream().filter(nullCheck).forEach(System.out::println);

		final Predicate<String> naoIniciadasEmB = palavra -> !palavra.startsWith("b");
		final List<String> palavras = new ArrayList<>();
		palavras.add("abacaxi");
		palavras.add("banana");
		palavras.add("cenoura");
		palavras.removeIf(naoIniciadasEmB.negate());
		System.out.println(palavras);

	}

}
