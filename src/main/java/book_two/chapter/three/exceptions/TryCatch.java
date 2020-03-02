package book_two.chapter.three.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

/**
 * O try sempre precisa de um catch ou finally, a não ser que seja um try-with-resources :).
 *
 * A interface Closeable possui o método public void close() throws IOException.
 *
 * A interface AutoCloseable é pai da Closeable e possui o método void close() throws Exception.
 *
 * @author rafael
 *
 */
public class TryCatch {

    public void metodo1() {
        try {
            if (true) {
                throw new SQLException();
            } else {
                throw new IOException();
            }
        } catch (SQLException | IOException e) {
            // No multi-catch, a excecao é final!
            // e = new Exception();
        } catch (Exception e) {
            // No catch padrao, ok...
            e = new Exception();
        }
    }

    public void rethrow() throws SQLException, IOException {
        try {
            this.couldThrowAnException();
        } catch (Exception e) {
            e = new IOException();
            // very very tricky... só dá pra rethrow se colocar Exception no throws desse método
            // throw e;
        }
    }

    public void couldThrowAnException() throws Exception {

    }

    public void tryWithResources() throws FileNotFoundException, IOException {
        try (final Reader reader = new BufferedReader(new FileReader(new File("")));
                final Reader reader2 = new BufferedReader(new FileReader(new File("")))) {
            System.out.println("Hey!");
        }
    }

    public static void main(final String[] args) {
        try (final One one = new One(); final Two two = new Two()) {
            System.out.println("Try");
            throw new RuntimeException();
        } catch (final Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }

    public static class One implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Closing One");
        }
    }

    public static class Two implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Closing Two");
        }
    }

}
