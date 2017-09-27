package chapter.four.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Colecoes {

    public static void main(final String[] args) {
        final Map<Integer, String> mapa1 = new HashMap<>();
        final Map<Integer, String> mapa2 = new TreeMap<>();
        final NavigableMap<Integer, String> mapa3 = new TreeMap<>();
        final Set<String> set1 = new HashSet<>();
        final Set<String> set2 = new TreeSet<>();
        final Deque<String> list1 = new LinkedList<>();
        final List<String> list2 = new ArrayList<>();
        final List<Integer> list3 = new ArrayList<>();
        final ConcurrentMap<String, String> queue1 = new ConcurrentHashMap<>();

        mapa1.put(1234, "primeiro");
        mapa1.put(1111, "segundo");

        mapa2.put(1234, "primeiro");
        mapa2.put(1111, "segundo");

        list1.add("primeiro");
        list1.add("segundo");
        list1.add("terceiro");
        list1.add("quarto");
        list1.addFirst("primeirão");
        list1.removeLast();

        list2.addAll(list1);
        Collections.sort(list2, String::compareTo);
        Collections.sort(list2, (s, t) -> s.length() - t.length());

        list3.add(10);
        list3.add(5);
        list3.add(1);
        list3.sort((x, y) -> Integer.compare(x, y));

        final double doub = 2L;

        set1.add("primeiro");

        set2.add("primeiro");

        mapa1.remove(1234, "primeiroo");
        mapa1.replace(1234, "primeiro", "novo");

        System.out.println(mapa1);
        System.out.println(mapa2);
        final Iterator<String> iteratorList1 = list1.iterator();
        while (iteratorList1.hasNext()) {
            System.out.println(iteratorList1.next());
        }

        System.out.println(list2);

        System.out.println(list3);

        mapa3.put(1, "um");
        mapa3.put(2, "dois");
        mapa3.put(10, "dez");
        System.out.println(mapa3.tailMap(10));
        System.out.println(mapa3.headMap(10));
        System.out.println(mapa3.firstEntry());

        "olá".chars().forEach(ch -> System.out.printf("%c ", ch));

    }

}
