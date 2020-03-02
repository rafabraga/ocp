package book_two.chapter.three.exceptions;

import java.io.IOException;

public class Supressed {

    public static void main(final String[] args) {
        try (final Bad bad1 = new Bad("1"); final Bad bad2 = new Bad("2")) {
            throw new RuntimeException("RUNTIME");
        } catch (final Exception e) {
            // System.err.println(e.getMessage());
            // for (final Throwable t : e.getSuppressed()) {
            // System.err.println("suppressed:" + t);
            // }
            throw new RuntimeException("OI");
        }
    }

    public static class Bad implements AutoCloseable {
        String name;

        public Bad(final String name) {
            this.name = name;
        }

        @Override
        public void close() throws IOException {
            throw new IOException("Closing " + this.name);
        }
    }

}
