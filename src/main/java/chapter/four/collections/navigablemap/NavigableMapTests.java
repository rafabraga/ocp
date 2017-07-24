package chapter.four.collections.navigablemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTests {

	public static void main(final String[] args) {
		final NavigableMap<Integer, String> notas = new TreeMap<>();

		notas.put(70, "Joãozinho");
		notas.put(65, "Pedrinho");
		notas.put(75, "Mariazinha");
		notas.put(67, "Fulaninho");

		System.out.println("As notas são: " + notas);
		System.out.println("As notas em ordem descendente são: " + notas.descendingMap());
		System.out.println("Passaram com média acima de 7: " + notas.tailMap(70));
		System.out.println("Não passaram (média abaixo de 7): " + notas.headMap(70));
		System.out.println("Menor nota: " + notas.firstEntry());
		System.out.println("Maior nota: " + notas.lastEntry());
	}

}
