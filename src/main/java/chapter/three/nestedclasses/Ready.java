package chapter.three.nestedclasses;

import java.util.TreeSet;

public class Ready {

    protected static int first = 2;
    private final static short DEFAULT_VALUE = 10;

    private static class GetSet {
        int first = 5;
        int second = DEFAULT_VALUE;
    }

    private final GetSet go = new GetSet();

    public static void main(final String[] args) {
        final Ready r = new Ready();
        final TreeSet<Ready> set = new TreeSet<>();
        set.add(r);
    }

}
