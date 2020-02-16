package book_two.chapter.one.etc;

public class Arrays {

    public static void main(final String[] args) {

        /**
         * Nao existe array primitivo, mas pode existir array DE primitivos.
         */
        final int[] arrayInts = { 1, new Integer(1), 3 };

        final int outroArray[] = { 4, 5, 6 };

        /**
         * Um array de duas dimensoes, mas declarado de jeito esquisito.
         */
        final int[] maisUmArray[] = { { 1, 2 }, { 3, 4 } };

        /**
         * Nao podemos incluir o tamanho do array na sua declaracao
         */
        // final int sohMaisUmArray[3] = { 4, 5, 6 };
    }

}
