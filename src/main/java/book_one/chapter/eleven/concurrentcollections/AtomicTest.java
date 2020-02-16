package book_one.chapter.eleven.concurrentcollections;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    Integer val = 10;
    Integer x = this.val;

    public AtomicTest(final Integer i) {
        this.val = i;
    }

    private final AtomicInteger value = new AtomicInteger(this.val);

    public static void main(final String[] args) {
        final AtomicTest at = new AtomicTest(5);
        System.out.println(at.value.decrementAndGet());
    }

}
