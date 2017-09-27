package chapter.eleven.synchronizedcollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SynchronizedCollections {

    public static void main(final String[] args) {
        final List<String> list = Arrays.asList("a", "b");
        final Set<String> set = new HashSet<>();
        final Map<Integer, String> map = new HashMap<>();
        final NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        final NavigableSet<String> navigableSet = new TreeSet<>();

        final List<String> syncList = Collections.synchronizedList(list);
        final Set<String> syncSet = Collections.synchronizedSet(set);
        final Map<Integer, String> syncMap = Collections.synchronizedMap(map);
        final NavigableMap<Integer, String> syncNavigableMap = Collections.synchronizedNavigableMap(navigableMap);
        final NavigableSet<String> syncNavigableSet = Collections.synchronizedNavigableSet(navigableSet);

        /*
         * As classes sincronizam o acesso às coleções por get() ou set(), mas não
         * sincronizam o iterator. Para isso, deve-se usar um synchronized block.
         */

        synchronized (syncList) {
            for (final String e : syncList) {
                System.out.println("Element: " + e);
            }
        }

        /*
         * Ao contrário das concurrent collections, as synchronized disparam uma
         * exception caso a mesma thread esteja tentando modificar a collection durante
         * uma iteração.
         */

        for (final String e : syncList) {
            System.out.println("Element: " + e);
            // syncList.remove(e);
        }
    }

}
