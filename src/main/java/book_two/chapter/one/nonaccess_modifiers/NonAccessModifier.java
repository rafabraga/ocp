package book_two.chapter.one.nonaccess_modifiers;

/**
 * final, abstract, static, transient e synchonized
 *
 * @author rafael
 *
 */
public abstract class NonAccessModifier {

    // Nao podemos combinar static e abstract
    // public static abstract boolean doStuff();

    /**
     * Apenas metodos podem ser synchonized
     */
    public synchronized void metodoSincronizado() {
        System.out.println("!!");
    }

    /**
     * Apenas inner classes podem ser static
     *
     * @author rafael
     *
     */
    static class InnerClass {

        public void testar() {
            synchronized (this) {
                System.out.println();
            }
        }
    }

}
