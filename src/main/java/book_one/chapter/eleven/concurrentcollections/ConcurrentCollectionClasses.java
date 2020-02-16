package book_one.chapter.eleven.concurrentcollections;

import java.util.Deque;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentCollectionClasses {

    public static void main(final String[] args) {
        final ConcurrentMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Um");
        concurrentHashMap.put(1, "Um um");
        concurrentHashMap.putIfAbsent(1, "Absent?");
        System.out.println(concurrentHashMap);

        final Deque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        // O push() adiciona elementos no head, ou seja, na frente.
        concurrentLinkedDeque.push("abacaxi");
        concurrentLinkedDeque.push("abóbora");

        // O offer() vai adicionando os elementos no tail, ou seja, no final.
        concurrentLinkedDeque.offer("Uva");
        concurrentLinkedDeque.offer("Tangerina");
        System.out.println(concurrentLinkedDeque);

        // O peek() vai retornar o head ou null se estiver vazio.
        System.out.println(concurrentLinkedDeque.peek());

        // O element() vai retornar o head ou lançar NoSuchElementException se estiver
        // vazio.
        System.out.println(concurrentLinkedDeque.element());

        final Queue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        final ConcurrentMap<Integer, String> concurrentSkipListMap1 = new ConcurrentSkipListMap<>();
        final SortedMap<Integer, String> concurrentSkipListMap2 = new ConcurrentSkipListMap<>();
        final NavigableMap<Integer, String> concurrentSkipListMap3 = new ConcurrentSkipListMap<>();
        final SortedSet<String> sortedSet = new ConcurrentSkipListSet<>();

        // NavigableSet é ordenado.
        final NavigableSet<String> navigableSet = new ConcurrentSkipListSet<>();
        navigableSet.add("Picanha");
        navigableSet.add("Arroz");
        navigableSet.add("Alface");
        System.out.println(navigableSet);

        final List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        final Set<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        final BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
        final BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();
        final BlockingQueue<String> blockingQueue2 = new LinkedBlockingQueue<>();
    }

}
