package book_one.chapter.five;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestesStream {

    public static void main(final String[] args) {
        Stream.generate(Math::random).limit(5).map(x -> x * 10).sorted().map((final Double x) -> x.intValue() * 10)
                .forEach(System.out::println);

        final IntStream intStream = IntStream.iterate(1, n -> n + 1).limit(5);
        System.out.println("Count da intStream: " + intStream.count());
        // System.out.println("Sum da intStream: " + intStream.sum());

        System.out.println("---------------");

        Stream.iterate(0, a -> a + 5).limit(5).forEach(System.out::println);
        Stream.iterate(true, a -> !a).limit(5).forEach(System.out::println);

        System.out.println("---------------");

        final List<String> listFrutas = new ArrayList<>();
        final Consumer<String> consumerStringFrutas = a -> listFrutas.add(a);
        consumerStringFrutas.accept("bergamota");
        consumerStringFrutas.accept("laranja");
        consumerStringFrutas.accept("abacaxi");
        consumerStringFrutas.accept("banana");
        consumerStringFrutas.accept("maçã");
        consumerStringFrutas.accept("mamão");
        consumerStringFrutas.accept("manga");

        final Stream<String> verduras = Stream.of("alface", "repolho", "couve", "cenoura", "pepino");

        final Map<Integer, List<String>> mapFrutasAgrupadasTamanho = listFrutas.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapFrutasAgrupadasTamanho);

        final Map<Integer, Long> mapFrutasAgrupadasTamanhoNumero = listFrutas.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(mapFrutasAgrupadasTamanhoNumero);

        final Map<Character, List<String>> mapFrutasAgrupadasInicial = listFrutas.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(mapFrutasAgrupadasInicial);

        final Map<Boolean, List<String>> mapFrutasParticionadas = listFrutas.stream()
                .collect(Collectors.partitioningBy(s -> s.length() <= 6));
        System.out.println("Frutas com até 6 letras: " + mapFrutasParticionadas.get(true));
        System.out.println("Frutas com mais de 6 letras: " + mapFrutasParticionadas.get(false));
        System.out.println("Lista de frutas ordenada: " + listFrutas.stream().sorted().collect(Collectors.toList()));
        System.out.println("Lista de frutas ordenada ao contrário: "
                + listFrutas.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        listFrutas.stream().mapToInt(s -> s.length()).forEach(System.out::println);

        System.out.println("Sum (int): " + listFrutas.stream().mapToInt(s -> s.length()).sum());
        System.out.println("Count (long): " + listFrutas.stream().mapToInt(s -> s.length()).count());
        System.out.println("findAny (OptionalInt): " + listFrutas.stream().mapToInt(s -> s.length()).findAny());
        System.out.println("findFirst (OptionalInt): " + listFrutas.stream().mapToInt(s -> s.length()).findFirst());
        final IntSummaryStatistics intSummaryStatistics = listFrutas.stream().mapToInt(s -> s.length())
                .summaryStatistics();
        System.out.println("Average (double): " + intSummaryStatistics.getAverage());
        System.out.println("Count (long): " + intSummaryStatistics.getCount());
        System.out.println("Max (int): " + intSummaryStatistics.getMax());
        System.out.println("Min (int): " + intSummaryStatistics.getMin());

        final Stream<String> phrases = Stream.of("over the river", "through the woods", "to grandmother's house we go");
        phrases.filter(s -> s.startsWith("t")).sorted(Comparator.reverseOrder()).findFirst()
                .ifPresent(System.out::println);

        final AtomicInteger atomic = new AtomicInteger(0);
        IntStream.generate(atomic::incrementAndGet).limit(5).forEach(System.out::println);
    }

}
