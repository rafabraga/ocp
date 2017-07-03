package chapter.six.extractdata;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tests {

	public static int somarUm(int valor) {
		return ++valor;
	}

	public static void main(final String[] args) {
		final long count = Stream.of(1, 2, 3, 4, 5).peek(i -> System.out.printf("%d -> ", i)).map(i -> i * i)
				.peek(i -> System.out.printf("%d ", i)).count();
		System.out.printf("The stream has %d elements.\n\n", count);

		final double somaRaizes = DoubleStream.of(1.0, 4.0, 9.0).map(Math::sqrt).peek(System.out::println).sum();
		System.out.println("A soma das raízes é " + somaRaizes);

		final int resultado = IntStream.of(1, 3, 5, 7, 9).map(Tests::somarUm).sum();
		System.out.printf("Resultado: %d", resultado);
	}

}
